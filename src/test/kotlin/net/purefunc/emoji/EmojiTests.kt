package net.purefunc.emoji

import org.junit.jupiter.api.Test

class EmojiTests {

    @Test
    internal fun `println emoji`() {
        val ints = arrayOf(0x263A, 0xFE0F).toIntArray()
        println(String(ints, 0, ints.size))

        Emoji0.values().forEach {
            println(it)
        }
        Emoji1.values().forEach {
            println(it)
        }
        Emoji2.values().forEach {
            println(it)
        }
        Emoji3.values().forEach {
            println(it)
        }
    }
}