import kotlin.math.sqrt
fun task1(){
    println("Введите а")
    val a = readLine()!!.toInt()
    println("Введите б")
    val b = readLine()!!.toInt()
    val c = sqrt((a*a)+(b*b).toDouble())
    println("Площадь треугольника равнa ${a*b/2}")
    println("Периметр треугольника равен ${c+b+a}")
}
fun task2(){
    println("Введите первую координату икс")
    val x1 = readLine()!!.toInt()
    println("Введите первую координату игрек")
    val y1 = readLine()!!.toInt()
    println("Введите вторую координату икс")
    val x2 = readLine()!!.toInt()
    println("Введите вторую координату игрек")
    val y2 = readLine()!!.toInt()
    println("Введите третью координату икс")
    val x3 = readLine()!!.toInt()
    println("Введите третью координату игрек")
    val y3 = readLine()!!.toInt()
    val a= sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)).toDouble())
    val b= sqrt(((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2)).toDouble())
    val c = sqrt(((x1-x3)*(x1-x3))+((y1-y3)*(y1-y3)).toDouble())
    val p = (a+b+c)/2
    val s=sqrt(p*(p - a)*(p - b)*(p - c))
    println("Периметр треугольника равен ${p*2}")
    println("Площадь треугольника равна $s")
}
fun task3(){
    println("Введите радиус окружности")
    val rad = readLine()!!.toInt()
    val dia =rad*2
    println("Длина окружности равна ${dia*3.14}")
    println("Площадь окружности равна ${(rad*rad)*3.14}")
}
fun task4(){
    println("ведите 4-х значное число")
    var n = readLine()!!.toInt()
    var a = 0
    var b = 1
    while (n>0) {
        a = n % 10
        n /= 10
        b *=a
    }
    println(b)
}
fun lab1() {
    //task1()
    //task2()
    //task3()
    //task4()
}