import kotlin.math.sqrt
fun task2_1 () {
    println("Введите 3 действительных числа")
    val a = readLine()!!.toDouble()
    if (a >= 0) println("${Math.pow(a, 2.0)}")
    else println("${Math.pow(a, 4.0)}")
    val b = readLine()!!.toDouble()
    if (b >= 0) println("${Math.pow(b, 2.0)}")
    else println("${Math.pow(b, 4.0)}")
    val c = readLine()!!.toDouble()
    if (c >= 0) println("${Math.pow(c, 2.0)}")
    else println("${Math.pow(c, 4.0)}")
}
fun task2_2(){

    println("Введите первую координату икс")
    val x1 = readLine()!!.toInt()
    println("Введите первую координату игрек")
    val y1 = readLine()!!.toInt()
    println("Введите вторую координату икс")
    val x2 = readLine()!!.toInt()
    println("Введите вторую координату игрек")
    val y2 = readLine()!!.toInt()
    val d= sqrt((x1*x1)+(y1*y1).toDouble())
    val s=sqrt((x2*x2)+(y2*y2).toDouble())
    if(d==s)
    {
        println("Точки A и B симметричны отностительно начала координат")
    }
    if (d<s){
        println( "Точка А находится ближе к началу координат.")
    }
    else {
        println("Точка B находится ближе к началу координат.")
    }
}
fun task2_3(){
    println("Введите первый угол треугольника")
    val x = readLine()!!.toInt()
    println("Введите второй угол треугольника")
    val y = readLine()!!.toInt()
    if((x+y<=180)&&x>0&&y>0) {
        println("Треугольник с указанными углами существует")
    }
    else println("Треугольник с указанными углами не существует")
    if ((x+y==90)&&x>0&&y>0){
        println("Этот треугольник будет прямоугольным")
    }
}
fun task2_4() {
    var z=0
    println(message = "Введите первое число")
    var x = readLine()!!.toFloat()
    println(message = "Введите второе число")
    var y = readLine()!!.toFloat()
    if (x > y) {
        z= y.toInt()
        y = (x + y)/2
        x =z*x* 2
    }
    else{
        z= x.toInt()
        x=(x+y)/2
        y= z*y* 2
    }
    println(x)
    println(y)
}
fun task2_5() {
    println("Введите координату икс")
    val S = readLine()!!.toInt()
    println("Введите координату игрек")
    val M = readLine()!!.toInt()
    if ((S == 0) && (M == 0))
        println("Точка лежит в начале координат")
    if ((S == 0) && (M != 0))
        println("Точка лежит на оси Y")
    if ((S != 0) && (M == 0))
        println("Точка лежит на оси X")
    if ((S < 0) && (M > 0))
        println("2 четверть")
    if ((S < 0) && (M < 0))
        println("3 четверть")
    if ((S > 0) && (M > 0))
        println("1 четверть")
    if ((S > 0) && (M < 0))
        println("4 четверть")
}
fun task2_6(){
    println("Введите число")
    val chislo = readLine()!!.toInt()
    println("Введите месяц")
    val mesyac = readLine()!!.toInt()
    if ((chislo>31)&&(chislo<0))
        println("Такого числа не существует.")
    else
        println("Такое число существует")
    if ((mesyac>12)&&(mesyac<0))
        println("Такого месяца не существует.")
    else
        println("Такой месяц существует")
}
fun task2_7(){

    println("Введите число")
    val a = readLine()!!.toInt()
    println("Введите число")
    val b = readLine()!!.toInt()
    println("Введите число")
    val c = readLine()!!.toInt()
    var x = 0
    if((a>b)&&(a>c)&&(b>c))
        x= a+c
    else
        if((a>b)&&(a>c)&&(c>b))
            x= a+b
        else
            if((b>a)&&(b>c)&&(a>c))
                x= b+c
            else
                if((a>b)&&(a>c)&&(c>b))
                    x = a+b
                else
                    if((c>a)&&(c>b)&&(a>b))
                        x = c+b
                    else
                        if((c>a)&&(c>b)&&(b>a))
                            x = c+a
    println(x)
}
fun task2_8(){
    println("Введите координату икс")
    val x = readLine()!!.toInt()
    println("Введите координату игрек")
    val y = readLine()!!.toInt()
    println("Введите радиус круга")
    val r = readLine()!!.toInt()
    val t= sqrt((x*x+y*y).toDouble())
    if (t>r)
        println("точка не пренадлежит кругу")
    else
        println("точка принадлежит кругу")
}
fun task2_9() {

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
    println("Введите координату игрек точки")
    val ty = readLine()!!.toInt()
    println("Введите координату икс точки")
    val tx = readLine()!!.toInt()
    if (((tx - x1) * (y1 - y2) - (ty - y1) * (x1 - x2) >= 0)
        && ((tx - x2) * (y2 - y3) - (ty - y2) * (x2 - x3) >= 0)
        && ((tx - x3) * (y3 - y1) - (ty - y3) * (x3 - x1) >= 0)
    )
        println("Точка лежит")
    else
        println("Не лежит")
}
fun task2_10() {
    println("Введите длину 1 стороны")
    val a = readLine()!!.toDouble()
    println("Введите длину 2 стороны")
    val b = readLine()!!.toDouble()
    println("Введите длину 3 стороны")
    val c = readLine()!!.toDouble()
    if ((a + b > c) && (a + c > b) && (b + c > a)) {
        println("такой треуголньик существует")
        if (((sqrt(a*a) + sqrt(b*b)) >= sqrt(c*c)) && ((sqrt(c*c) + sqrt(b*b)) >= sqrt(a*a)) && ((sqrt(a*a) + sqrt(c*c)) >= sqrt(b*b)))
        {
            println("Треугольник является остроугольным")
        }
        else
        {
            println("Треугольник не является остроугольным")
        }

    }
    else
    {
        println("Такого треугольника не существует")
    }
}

fun lab2(){
    //task2_1()
    //task2_2()
    //task2_3()
    //task2_4()
    //task2_5()
    //task2_6()
    //task2_7()
    //task2_8()
    //task2_9()
    //task2_10()
}