fun count(input: String): String {
    val result = StringBuilder()//функция пробежки по строке
    var j = 1
    for (i in 1 until input.length) {
        if (input[i] == input[i - 1]) {
            j++
        } else {
            result.append(input[i - 1])
            if (j > 1) {
                result.append(j)
            }
            j = 1
        }
    }
    result.append(input[input.length - 1])
    if (j > 1) {
        result.append(j)
    }
    return result.toString()
}
fun main() {
    println("Введите строку символов: ")
    val input = readln().toString()
    val output = count(input)
    println(output)
}