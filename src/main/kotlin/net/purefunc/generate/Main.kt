package net.purefunc.generate

import net.purefunc.generate.util.EmojiReader
import net.purefunc.generate.util.ValidEmojiCollector
import java.io.File
import java.io.FileOutputStream
import java.util.Locale

fun main() {
    val roughList = EmojiReader("https://unicode.org/Public/emoji/15.0/emoji-test.txt").readTargetUrl()
    val bigEnum = ValidEmojiCollector(roughList).filter()

    // all enum in one .kt is will exceed jvm limit 64K
    val pageCount = 1000
    val pageSize = (bigEnum.size / pageCount)
    val pagingItems = (0..pageSize).map { page ->
        if (pageCount * (page + 1) > bigEnum.size) {
            bigEnum.subList(pageCount * page, bigEnum.size)
        } else {
            bigEnum.subList(pageCount * page, pageCount * (page + 1))
        }
    }

    pagingItems.forEachIndexed { fileIdx, item ->
        val fos = FileOutputStream(File("src/main/kotlin/net/purefunc/emoji/Emoji$fileIdx.kt"))
        fos.write("package net.purefunc.emoji\n".toByteArray())
        fos.write("\n".toByteArray())
        fos.write("enum class Emoji$fileIdx(\n".toByteArray())
        fos.write("    private val intArray: IntArray,\n".toByteArray())
        fos.write(") {\n".toByteArray())
        fos.write("\n".toByteArray())

        item.forEachIndexed { idx, element ->
            val idxListThird = element.mapIndexed { i, e -> if (e == ";") i else -1 }
            val splitIdx = idxListThird.filter { i -> i != -1 }[0]

            val name = element.subList(splitIdx + 1, element.size).joinToString("_").uppercase(Locale.getDefault())
            val hexs = element.subList(0, splitIdx).map { hex -> "0x$hex" }.joinToString(",")
            val emojiIntArr = element.subList(0, splitIdx).map { hex -> hex.toInt(16) }.toIntArray()
            val emoji = String(emojiIntArr, 0, emojiIntArr.size)

            val comment = "    // $emoji $emoji $emoji"
            val enum = "    $name(intArrayOf($hexs))"
            if (idx == item.size - 1) {
                fos.write("$comment\n$enum;\n".toByteArray())
            } else {
                fos.write("$comment\n$enum,\n".toByteArray())
            }
        }

        fos.write("\n".toByteArray())
        fos.write("    override fun toString() = String(intArray, 0, intArray.size)\n".toByteArray())
        fos.write("}\n".toByteArray())
    }
}
