package org.example.org.example.lessons.lesson07.homeworks


fun main() {
    //прямой
    for (i in 1..5) {
        println(i)
    }
    for (i in 1..10) {
        println(i)
    }
    //обратный
    for (i in 5 downTo 1) {
        println(i)
    }
    for (i in 5 downTo 1) {
        println(i * 2)
    }
    //step
    for (i in 1..9 step 2) {
        println(i)
    }
    for (i in 1..20 step 3) {
        println(i)
    }
//until
    val size: Int = 10
    for (i in 3 until size step 2) {
        println(i)
    }
    //while
    var num = 0
    while (num++ < 10) {
        println(num * num)
    }
    var counter = 10
    while (counter > 4) {
        println(counter)
        counter--
    }
    //do while
    var start = 5
    var end = 1
    do {
        println(start)
        start--
    } while (start >= end)

    var starting = 5
    do {
        println(starting)
        starting++
    } while (starting < 10)
    //break
    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }
    var c = 0
    while (c > -1) {
        println(c)
        if (c == 10) break
        c++
    }
    //continue
    for (i in 1..10 step 2) {
        if (i % 2 == 0) continue
        println(i)
    }
    var i = 1
    while (i <= 10) {
        if (i % 3 == 0) {
            i++
            continue
        }
        println(i)
        i++
    }



}
