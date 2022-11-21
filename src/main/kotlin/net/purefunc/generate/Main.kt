package net.purefunc.generate

import net.purefunc.generate.util.EmojiCollector
import net.purefunc.generate.util.EmojiFileCreator
import net.purefunc.generate.util.EmojiReader

fun main() {
    EmojiFileCreator.writeAsEnumFile(
        EmojiCollector.filter(
            EmojiReader.readTargetUrl("https://unicode.org/Public/emoji/15.0/emoji-test.txt")
        )
    )
}
