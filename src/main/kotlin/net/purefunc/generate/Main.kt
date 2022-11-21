package net.purefunc.generate

import net.purefunc.generate.util.EmojiFileCreator
import net.purefunc.generate.util.EmojiReader
import net.purefunc.generate.util.ValidEmojiCollector

fun main() {
    val roughList = EmojiReader("https://unicode.org/Public/emoji/15.0/emoji-test.txt").readTargetUrl()
    val bigEnum = ValidEmojiCollector(roughList).filter()
    EmojiFileCreator(1000).writeAsEnumFile(bigEnum)
}
