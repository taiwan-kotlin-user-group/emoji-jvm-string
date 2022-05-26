package net.purefunc.emoji

enum class Emoji(
    private val code: Int,
) {

    grinning_face(0x1F600),
    grinning_1face(0x1F609);

    override fun toString(): String {
        return String(Character.toChars(code))
    }
}