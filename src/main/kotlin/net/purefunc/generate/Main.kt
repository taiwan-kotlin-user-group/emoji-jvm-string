package net.purefunc.generate

import java.io.File
import java.io.FileOutputStream
import java.util.Locale

fun main() {
    val lines = mutableListOf<String>()
    var flag = false
    File("emoji-test.txt").forEachLine { line ->
        if (line == "") flag = false
        if (flag) lines.add(line)
        if (line.startsWith("# subgroup: ")) flag = true
    }
    val result = lines.filter { it.contains("fully-qualified") }.map { it.split(" ") }.map {
        val items = mutableListOf<String>()
        items.add(it[0])
        var idx = 0
        it.forEachIndexed { index, element -> if (element.startsWith("E") && element.contains(".")) idx = index }
        items.addAll(
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
                    .replace(",", "")
                    .replace("&", "")
            }
        )
        items
    }
    val fos = FileOutputStream(File("src/main/kotlin/net/purefunc/emoji/Emoji.kt"))
    fos.write("package net.purefunc.emoji\n".toByteArray())
    fos.write("\n".toByteArray())
    fos.write("enum class Emoji(\n".toByteArray())
    fos.write("    private val code: Int,\n".toByteArray())
    fos.write(") {\n".toByteArray())
    fos.write("\n".toByteArray())

    result.forEachIndexed { index, strings ->
        val s = "    ${
            strings.subList(1, strings.size).joinToString("_") { it.uppercase(Locale.getDefault()) }
        }(0x${strings[0]})"
        if (index == result.size - 1) {
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