fun main() {
    val frase = "Francisco Rios Hola Mundo"
    println(diccionario(frase))
}

fun diccionario(frase: String): Map<String, Int> {
    val diccionario: MutableMap<String, Int> = mutableMapOf()
    val cont = listOf(*frase.split(" ".toRegex()).toTypedArray())
    for (i in cont.indices) {
        diccionario[cont[i]] = cont[i].length
    }
    return diccionario
}