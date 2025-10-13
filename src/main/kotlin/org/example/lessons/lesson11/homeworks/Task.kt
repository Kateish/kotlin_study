package org.example.org.example.lessons.lesson11.homeworks

class Task {
    //Задачи на сигнатуру метода
//Напишите сигнатуру метода в которую входит модификатор доступа, название функции, список аргументов с типами и возвращаемое значение. В теле метода можешь сделать возврат объекта нужного типа если это требуется для устранения ошибок.
//Не принимает аргументов и не возвращает значения.
    public fun nothing(): Unit {
    }

    //Принимает два целых числа и возвращает их сумму.
    public fun mySum(a: Int, test: Int): Int {
        return a + test
    }

    //Принимает строку и ничего не возвращает.
    public fun strings(s: String): Unit {
    }

    //Принимает список целых чисел и возвращает среднее значение типа Double.
    public fun intSum(nums: List<Int>): Double {
        return nums.average()
    }

    //Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
    private fun nulls(myString: String?): Int? {
        return myString?.length
    }

    //Не принимает аргументов и возвращает nullable вещественное число.
    public fun noargs(): Double? {
        return null
    }

    //Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
    private fun nullList(numbs: List<Int>?): Unit {}

    //Принимает целое число и возвращает nullable строку.
    public fun intToNul(myInteg: Int): String? {
        return myInteg.toString()
    }

    //Не принимает аргументов и возвращает список nullable строк.
    public fun noa(): List<String>? {
        return listOf("", "")
    }

    //Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
    public fun nulStr(myStr: String?, myIn: Int?): Boolean? {
        return null
    }

    //Задачи на написание кода
//Напишите валидную сигнатуру метода а так же рабочий код для задач.
//
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
    public fun multiplyByTwo(a: Int): Int {
        return a * 3
    }

    //Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
    public fun isEven(a: Int): Boolean {
        return if (a % 2 == 0) true else false
    }

    //Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
    public fun printNumbersUntil(n: Int) {
        if (n < 1) {
            return
        }
        for (i in 1..n)
            println(i)
    }

    //Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
    public fun findFirstNegative(myList: List<Int>): Int? {
        for (n in myList) {
            if (n < 0) return n
        }
        return null
    }

    //Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
    public fun processList(myList: List<String?>) {
        for (value in myList) {
            if (value == null) return
            println(value)
        }
    }
}