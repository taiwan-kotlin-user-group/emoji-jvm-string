package net.purefunc.generate.util

class EmojiCollector {

    companion object {
        fun filter(source: List<String>) =
            source
                .filter {
                    it.contains("fully-qualified")
                }.map {
                    it.split(" ")
                }.map { elements ->
                    // [1F636, 200D, 1F32B, FE0F, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , ;, fully-qualified, , , , , #, 😶‍🌫️, E13.1, face, in, cloud]

                    val items = mutableListOf<String>()

                    val codePartIdxs = elements.mapIndexed { idx, element -> if (element.isEmpty() || element == ";") idx else -1 }
                    val codeIdx = codePartIdxs.first { idx -> idx != -1 }

                    (0 until codeIdx).forEach { i -> items.add(elements[i]) }
                    items.add(";")

                    val namePartIdxs =
                        elements.mapIndexed { idx, element -> if (element.startsWith("E") && element.contains(".")) idx else -1 }
                    val nameIdx = namePartIdxs.first { idx -> idx != -1 }

                    items.plus(elements.subList(nameIdx + 1, elements.size).map { str -> convertToValidChar(str) })
                }

        private fun convertToValidChar(str: String) =
            // replace item name contains invalid char
            str.replace("“", "")
                .replace("”", "")
                .replace("’", "")
                .replace("-", "_")
                .replace(":", "")
                .replace(".", "")
                .replace("!", "")
                .replace("(", "")
                .replace(")", "")
                .replace("1st", "first")
                .replace("2nd", "second")
                .replace("3rd", "third")
                .replace("package", "packages")
                .replace("#", "hash")
                .replace("*", "star")
                .replace(",", "comma")
                .replace("&", "and")
    }
}
