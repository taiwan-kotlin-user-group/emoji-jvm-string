package net.purefunc.generate.util

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL

class EmojiReader(private val targetUrl: String) {

    fun readTargetUrl(): MutableList<String> {
        // collect emoji lines
        // 1F636 200D 1F32B FE0F                                  ; fully-qualified     # 😶‍🌫️ E13.1 face in clouds
        var flag = false
        val lines = mutableListOf<String>()
        val url = URL(targetUrl)
        val reader = BufferedReader(InputStreamReader(url.openConnection().getInputStream()))
        reader.useLines { readLines ->
            readLines.forEach { line ->
                if (line.isEmpty()) flag = false
                if (flag) lines.add(line)
                if (line.startsWith("# subgroup: ")) flag = true
            }
        }
        return lines
    }
}
