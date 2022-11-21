package net.purefunc.generate.util

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL

class EmojiReader(private val targetUrl: String) {

    fun readTargetUrl(): List<String> =
        // collect emoji lines
        // 1F636 200D 1F32B FE0F                                  ; fully-qualified     # 😶‍🌫️ E13.1 face in clouds
        buildList {
            var flag = false
            val reader = BufferedReader(InputStreamReader(URL(targetUrl).openConnection().getInputStream()))
            reader.useLines { readLines ->
                readLines.forEach { line ->
                    if (line.isEmpty()) flag = false
                    if (flag) add(line)
                    if (line.startsWith("# subgroup: ")) flag = true
                }
            }
        }
}
