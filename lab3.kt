@file:Suppress("NAME_SHADOWING")
import java.util.*

fun task3_1(){
    println("Введите 4-х значное число")
    var a = readLine()!!.toInt()
    var m = a%10
    a /= 10
    while (a > 0){
        if ((a % 10) > m)
        m = a % 10
        a /= 10
    }
    println(m)
}
fun task3_2(){
    println("Введите 4-х значное число")
    var n = readLine()!!.toInt()
    var sum =0
    var multi =1
    while(n>0) {
        sum += n % 10
        multi *= (n % 10)
        n /= 10
        }
   println("Сумма цифр равна $sum")
    println("Произведение цифр равно $multi")
    }
fun task3_3(){
    println("Введите минимум")
    var a = readLine()!!.toInt()
    println("Введите максимум")
    val b = readLine()!!.toInt()
    println("Введите шаг")
    val c = readLine()!!.toInt()
    while(b>=a)
    {
        println("$a")
        a += c
    }
    }
fun task3_4(){
    println("Введите число")
    val a = readLine()!!.toInt()
    var s=1
    var i=1
    for( i in 1..a) {
        s = s * i
    }
    println(s)
    }
fun task3_5(){
    println("Введите число")
    var n = readLine()!!.toInt()
    var chet =0
    var nechet =0
    while (n>0){
        if(n%2 == 0) chet=chet+1
        else
            nechet += 1
            n = n/10
    }
    println("Четных-$chet,Нечетных-$nechet")
}
fun task3_6(){
    println("Введите число")
    val n = readLine()!!.toInt()
    var f1=1
    var b=0
    var f2=2
    val i=3
    println(" $f1")
    println(" $f2")
    for(i in 3..n)
    {
        println(" ${f1+f2}")
        b = f1
        f1 = f2
        f2 = b+f1
    }
    println()
}
fun task3_7(){
    println("Введите число")
    var n = readLine()!!.toInt()
    var m = 0
    var a = 0
    while (n>0)
    {
        a = n%10
        n = n/10
        m = m*10+a
    }
    println(m)
    }
fun task3_8() {
    println("Введите число")
    val n = readLine()!!.toInt()
    var a = 1.toFloat()
    var i = 0.toFloat()
    var summa = 0.toFloat()
    while (i < n) {
        summa = a
        a = a /-2
        i += 1
    }
    println(summa)
}
fun task3_9() {
    fun IntRange.random() =
        Random().nextInt((endInclusive + 1) - start) + start
    val n = (1..100).random()
    var i = 1
    println("Отгадайте число за 10 попыток")
    while (i <= 10) {
        println("$i-я Попытка")
        println("Введите число")
        val u = readLine()!!.toInt()
        if (u < n) {
            println("Мало")
        } else
            if (u > n) {
                println("Много")
            } else {
                println("Угадано! $n")
                break
            }
        i += 1
    }
    if (i == 11) {
        println("Вы не угадали это число $n")
    }
}
fun lab3() {
//task3_1()
//task3_2()
//task3_3()
// task3_4()
// task3_5()
// task3_6()
// task3_7()
// task3_8()
// task3_9()
}