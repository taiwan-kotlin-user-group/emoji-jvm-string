package net.purefunc.generate

import java.io.File
import java.io.FileOutputStream
import java.util.Locale

fun main() {
    // collect emoji lines
    val lines = mutableListOf<String>()
    var flag = false
    File("emoji-test.txt").forEachLine { line ->
        if (line == "") flag = false
        if (flag) lines.add(line)
        if (line.startsWith("# subgroup: ")) flag = true
    }

    val bigEnum = lines.filter {
        it.contains("fully-qualified")
    }.map {
        it.split(" ")
    }.map {
        val items = mutableListOf<String>()

        // find code part
        var codeIdx = 0
        it.forEachIndexed { index, element -> if (element == "") codeIdx = index }
        (0 until codeIdx).forEach { i ->
            items.add(it[i])
        }

        // find index start from E
        var idx = 0
        it.forEachIndexed { index, element -> if (element.startsWith("E") && element.contains(".")) idx = index }

        items.addAll(
            // process item name
            it.subList(idx + 1, it.size).map { str ->
                str.replace("“", "")
                    .replace("”", "")
                    .replace("’", "")
                    .replace("-", "_")
                    .replace(":", "")
                    .replace(".", "")
                    .replace("!", "")
                    .replace("(", "")
                    .replace(")", "")
                    .replace("1st", "first")
                    .replace("2nd", "second")
                    .replace("3rd", "third")
                    .replace("package", "packages")
                    .replace("#", "hash")
                    .replace("*", "star")
                    .replace(",", "comma")
                    .replace("&", "and")
            }
        )

        items
    }

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

        item.forEachIndexed { idx, strings ->
            val s = "    ${
                strings.subList(1, strings.size).joinToString("_") { it.uppercase(Locale.getDefault()) }
            }(intArrayOf(0x${strings[0]}))"
            if (idx == item.size - 1) {
                fos.write("$s;\n".toByteArray())
            } else {
                fos.write("$s,\n".toByteArray())
            }
        }

        fos.write("\n".toByteArray())
        fos.write("    override fun toString(): String {\n".toByteArray())
        fos.write("        return String(Character.toChars(code))\n".toByteArray())
        fos.write("    }\n".toByteArray())
        fos.write("}\n".toByteArray())
    }
}