fun main()
{
    println("введите первое число: ")
    val n1 = readln().toDouble()
    println("введите второе число: ")
    val n2 = readln().toDouble()
    println("Введите операцию: ")//опеарции могут быть деление/умножение/сложение/вычитание
    val op = readln().toString()


    when (op)
    {
        "+" ->println("Результат:$n1+$n2=${n1+n2}")
        "-" ->println("Результат:$n1-$n2=${n1-n2}")
        "*" ->println("Результат:$n1*$n2=${n1*n2}")
        "/" ->println("Результат:$n1/$n2=${n1/n2}")
    }



}
