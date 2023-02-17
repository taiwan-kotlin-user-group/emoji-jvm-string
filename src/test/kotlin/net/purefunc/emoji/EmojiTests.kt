package net.purefunc.emoji

import org.junit.jupiter.api.Test

class EmojiTests {

    @Test
    internal fun `println emoji`() {
        Emoji0.values().forEach {
            println(it)
        }
        Emoji1.values().forEach {
            println(it)
        }
    }
}
