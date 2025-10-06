package org.example.org.example.lessons.lesson09.homeworks

fun main() {
    // Математические операции с множествами
    val A = setOf(1, 2, 3, 4)
    val B = setOf(3, 4, 5)
    val union = A union B
    val inter = A intersect B
    val diff = A subtract B
    println("union  = $union")
    println("inter  = $inter")
    println("diff   = $diff")

    // Перебор из примеров
    val set = setOf("K", "o", "t", "l", "i", "n")
    for (ch in set) println("| $ch |")

    val list = listOf(32, 53, 1, -76)
    for (i in list.indices) {
        if (i == list.lastIndex) println(list[i] + list[0])
        else println(list[i] + list[i + 1])
    }
    var i = list.lastIndex
    while (i >= 0) println("${list[i--]}")

    // Array
    val a1 = arrayOf(1, 2, 3, 4, 5)
    val a2 = Array(10) { "" }
    val a3 = DoubleArray(5) { it * 2.0 }
    val a4 = IntArray(5); for (k in a4.indices) a4[k] = k * 3
    val a5 = arrayOf<String?>(null, "one", "two")
    val src = intArrayOf(9, 8, 7, 6);
    val copy = IntArray(src.size); for (k in src.indices) copy[k] = src[k]
    val x = intArrayOf(10, 20, 30);
    val y = intArrayOf(1, 2, 3)
    val z = IntArray(x.size) { idx -> x[idx] - y[idx] }; println(z.joinToString())

    val arr = intArrayOf(4, 6, 5, 7, 8)
    var index = 0;
    var pos = -1
    while (index < arr.size) {
        if (arr[index] == 5) {
            pos = index
            break
        }
        index++
    }
    println("index of 5 = $pos")

    for (v in arr) println("$v — ${if (v % 2 == 0) "чётное" else "нечётное"}")

    findAndPrint(arrayOf("apple", "pineapple", "orange"), "apple")

    //List
    val l0: List<Int> = emptyList()
    val l1 = listOf("Hello", "World", "Kotlin")
    val ml = mutableListOf(1, 2, 3, 4, 5)
    ml.addAll(listOf(6, 7, 8))
    val ml2 = mutableListOf("Hello", "World", "Kotlin")
    ml2.remove("World")
    val l2 = listOf(7, 8, 9)
    for (v in l2) println(v)
    val lStr = listOf("a", "b", "c")
    println(lStr[1])
    val mNums = mutableListOf(10, 20, 30, 40)
    mNums[2] = 99

    val LA = listOf("A", "B")
    val LB = listOf("C", "D")
    val merged = mutableListOf<String>()
    for (s in LA) merged.add(s)
    for (s in LB) merged.add(s)
    println("merged = $merged")

    val ints = listOf(5, 2, 8, -3, 8, 0)
    var min = ints[0]
    var max = ints[0]
    for (v in ints) {
        if (v < min) min = v; if (v > max) max = v
    }
    println("min=$min max=$max")

    val evens = mutableListOf<Int>()
    for (v in ints) if (v % 2 == 0) evens.add(v)
    println("evens = $evens")

    //Set
    val s0: Set<Int> = emptySet()
    val s1 = setOf(1, 2, 3)
    val mutableSet = mutableSetOf("Kotlin", "Java", "Scala")
    mutableSet.add("Swift")
    mutableSet.add("Go")
    val msInt = mutableSetOf(1, 2, 3)
    msInt.remove(2)
    val sPrint = setOf(10, 20, 30)
    for (e in sPrint) println(e)

    println("inSet = " + inSet(setOf("red", "green", "blue"), "green"))

    val sToList = setOf("x", "y", "z")
    val mutableList = mutableListOf<String>()
    for (e in sToList) mutableList.add(e)
    println("mutableList = $mutableList")
}

//  Array-10: поиск подстроки в массиве строк и печать найденного
fun findAndPrint(arr: Array<String>, needle: String) {
    for (s in arr) if (s.contains(needle)) {
        println("found: $s")
        return
    }
    println("not found")
}

//  Set-7: наличие строки в Set через цикл
fun inSet(set: Set<String>, value: String): Boolean {
    for (s in set) if (s == value) return true
    return false
}