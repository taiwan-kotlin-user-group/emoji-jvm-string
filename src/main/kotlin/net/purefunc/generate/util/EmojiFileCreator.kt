package net.purefunc.generate.util

import java.io.File
import java.io.FileOutputStream
import java.util.Locale

class EmojiFileCreator {

    companion object {
        // all enum in one .kt will exceed jvm limit 64K
        fun writeAsEnumFile(source: List<List<String>>, pageCount: Int = 1000) {
            val pagingItems = allocatePerPageItem(source, pageCount)

            pagingItems.forEachIndexed { fileIdx, item ->
                val fos = FileOutputStream(File("src/main/kotlin/net/purefunc/emoji/Emoji$fileIdx.kt"))
                fos.generateFileHeader(fileIdx)

                item.forEachIndexed { idx, element ->
                    val idxListThird = element.mapIndexed { i, e -> if (e == ";") i else -1 }
                    val splitIdx = idxListThird.first { i -> i != -1 }

                    val name = element.subList(splitIdx + 1, element.size).joinToString("_").uppercase(Locale.getDefault())
                    val hexs = element.subList(0, splitIdx).joinToString(", ") { hex -> "0x$hex" }
                    val emojiIntArr = element.subList(0, splitIdx).map { hex -> hex.toInt(16) }.toIntArray()
                    val emoji = String(emojiIntArr, 0, emojiIntArr.size)

                    val comment = "    // $emoji $emoji $emoji"
                    val enum = "    $name(intArrayOf($hexs))"
                    if (idx == item.size - 1) {
                        fos.writeLastLine(comment, enum)
                    } else {
                        fos.writeNextLine(comment, enum)
                    }
                }

                fos.generateFileFooter()
            }
        }

        private fun allocatePerPageItem(source: List<List<String>>, pageCount: Int): List<List<List<String>>> {
            val pageSize = (source.size / pageCount)
            return (0..pageSize).map { page ->
                val pageList: (Int) -> List<List<String>> = { source.subList(pageCount * page, it) }
                if (pageCount * (page + 1) > source.size)
                    pageList(source.size)
                else
                    pageList(pageCount * (page + 1))
            }
        }

        private fun FileOutputStream.generateFileHeader(fileIdx: Int) =
            write(
                """
                package net.purefunc.emoji

                enum class Emoji$fileIdx(
                    private val intArray: IntArray,
                ) {

                """.trimIndent().toByteArray()
            )

        private fun FileOutputStream.writeNextLine(comment: String, enum: String) = write("$comment\n$enum,\n".toByteArray())

        private fun FileOutputStream.writeLastLine(comment: String, enum: String) = write("$comment\n$enum;\n".toByteArray())

        private fun FileOutputStream.generateFileFooter() =
            write(
                """
            
                override fun toString() = String(intArray, 0, intArray.size)
            }
            
                """.trimIndent().toByteArray()
            )
    }
}
