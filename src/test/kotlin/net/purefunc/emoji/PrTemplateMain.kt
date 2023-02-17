package net.purefunc.emoji

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import java.io.InputStreamReader
import java.net.URL

fun main() {
    val objectMapper = jacksonObjectMapper()
    val url = URL("https://raw.githubusercontent.com/carloscuesta/gitmoji/master/packages/gitmojis/src/gitmojis.json")
    val json = objectMapper.readValue(InputStreamReader(url.openConnection().getInputStream()), object : TypeReference<Map<*, *>>() {})
    val output = mutableListOf("| emoji | name | description |", "|:---:|:---|:---|")
    (json["gitmojis"] as List<*>)
        .map { gitmoji ->
            val gitmojiMap = gitmoji as Map<*, *>
            Gitmoji(
                emoji = gitmojiMap["emoji"].toString(),
                code = gitmojiMap["code"].toString(),
                description = gitmojiMap["description"].toString(),
            )
        }
        .sortedBy { it.description.first() }
        .forEach { output.add("| ${it.emoji} | ${it.code} | ${it.description} |") }

    println(output.joinToString("\n"))
}

data class Gitmoji(
    val emoji: String,
    val code: String,
    val description: String,
)
