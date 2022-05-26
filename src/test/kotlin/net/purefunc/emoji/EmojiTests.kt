package net.purefunc.emoji

import org.junit.jupiter.api.Test

class EmojiTests {

    @Test
    internal fun `println emoji`() {
        Emoji.values().forEach {
            println(it)
        }
    }
}