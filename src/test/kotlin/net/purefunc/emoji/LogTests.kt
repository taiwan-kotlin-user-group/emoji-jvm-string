package net.purefunc.emoji

import org.junit.jupiter.api.Test
import java.io.File

class LogTests {

    @Test
    internal fun readFileTest() {
        val lines = mutableListOf<String>()
        var flag = false
        File("emoji-test.txt").forEachLine { line ->
            if (line == "") flag = false
            if (flag) lines.add(line)
            if (line.startsWith("# subgroup: ")) flag = true
        }
        lines.filter { it.contains("fully-qualified") }.map { it.split(" ") }.filter { it[1] == "" }.map {
            val items = mutableListOf<String>()
            items.add(it[0])
            var idx = 0
            it.forEachIndexed { index, element -> if (element.startsWith("E") && element.contains(".")) idx = index }
            items.addAll(it.subList(idx + 1, it.size))
            items
        }.map {
            println(it)
        }
    }

    //    @Test
    internal fun test() {
        println(Emoji.grinning_1face)
    }
}