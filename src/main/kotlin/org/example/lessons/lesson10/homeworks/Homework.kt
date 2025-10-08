package org.example.org.example.lessons.lesson10.homeworks

class Homework {
    //    Задачи на работу со словарём
//    Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val emptyMap = mapOf<Int, Int>()

    //    Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val floDoubles = mapOf(1.24f to 24.081)

    //    Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val mutableM = mutableMapOf(29 to "Paris")

    //    Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    fun print() {
        mutableM[1] = "Rwanda"
    }

    //    Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
    fun main() {
        println(mutableM.get(29))
        println(mutableM.get(19))
    }

    //    Удалите определенный элемент из изменяемого словаря по его ключу.
    fun remove() {
        mutableM.remove(1)
    }

    fun main1() {
//Map<Double, Int>: деление ключа на значение с обработкой
        val ratios: Map<Double, Int> = mapOf(
            10.0 to 2,
            3.5 to 0,
            -8.0 to 4
        )
        for ((key, value) in ratios) {
            if (value == 0) {
                println("$key / $value = бесконечность")
            } else {
                val result = key / value
                println("$key / $value = $result")
            }
        }

//Изменение значения для существующего ключа в изменяемом словаре
        val mutable: MutableMap<String, Int> = mutableMapOf(
            "apples" to 10,
            "oranges" to 7
        )
        println("До: $mutable")
        if ("apples" in mutable) {
            mutable["apples"] = mutable["apples"]!! + 5
        }
        println("После: $mutable")

//Объединение двух словарей в третий через циклы
        val mapA: Map<String, Int> = mapOf("a" to 1, "b" to 2)
        val mapB: Map<String, Int> = mapOf("b" to 3, "c" to 4)
        val merged: MutableMap<String, Int> = mutableMapOf()
        for ((k, v) in mapA) merged[k] = v
        for ((k, v) in mapB) merged[k] = (merged[k] ?: 0) + v
        println("A: $mapA")
        println("B: $mapB")
        println("Merged: $merged")

// Map<String, MutableList<Int>>: добавление элементов
        val listMap: MutableMap<String, MutableList<Int>> = mutableMapOf(
            "odd" to mutableListOf(1, 3),
            "even" to mutableListOf(2, 4)
        )
        if ("odd" !in listMap) listMap["odd"] = mutableListOf()
        listMap["odd"]!!.addAll(listOf(5, 7))

        if ("even" !in listMap) listMap["even"] = mutableListOf()
        listMap["even"]!!.addAll(listOf(6, 8))

        if ("primes" !in listMap) listMap["primes"] = mutableListOf()
        listMap["primes"]!!.addAll(listOf(2, 3, 5, 7))

        println(listMap)

//Map<Int, MutableSet<String>>: получить множество по ключу, добавить строку, распечатать
        val setsMap: MutableMap<Int, MutableSet<String>> = mutableMapOf(
            1 to mutableSetOf("one", "uno"),
            2 to mutableSetOf("two", "dos")
        )
        val keyToUpdate = 2
        if (!setsMap.containsKey(keyToUpdate)) {
            setsMap[keyToUpdate] = mutableSetOf()
        }
        val setRef = setsMap[keyToUpdate]!!
        setRef.add("deux")
        println("По ключу $keyToUpdate -> $setRef")

//Map<Pair<Int, Int>, String>: найти значение, если в паре есть цифра 5
        val pairMap: Map<Pair<Int, Int>, String> = mapOf(
            (1 to 2) to "A",
            (5 to 9) to "B",
            (3 to 5) to "C",
            (7 to 8) to "D"
        )
        val found = pairMap.filterKeys { (a, b) -> a == 5 || b == 5 }.values
        if (found.isEmpty()) {
            println("Не найдено значений с парой, содержащей 5.")
        } else {
            println("Найдены значения (у ключей с 5): $found")
        }

//Подбор оптимальных типов для словарей
        val library: MutableMap<String, MutableList<String>> = mutableMapOf(
            "Рэй Брэдбери" to mutableListOf("451° по Фаренгейту", "Марсианские хроники"),
            "Айзек Азимов" to mutableListOf("Основание", "Я, Робот")
        )
        val plants: MutableMap<String, MutableList<String>> = mutableMapOf(
            "Цветы" to mutableListOf("Роза", "Тюльпан"),
            "Деревья" to mutableListOf("Дуб", "Берёза")
        )
        val quarterFinals: MutableMap<String, MutableList<String>> = mutableMapOf(
            "Сокол" to mutableListOf("Иванов", "Петров", "Сидоров"),
            "Вихрь" to mutableListOf("Смирнов", "Кузнецов", "Попов")
        )
        val treatment: MutableMap<java.time.LocalDate, MutableList<String>> = mutableMapOf(
            java.time.LocalDate.of(2025, 10, 1) to mutableListOf("Амоксициллин", "Пробиотик"),
            java.time.LocalDate.of(2025, 10, 2) to mutableListOf("Ибупрофен")
        )
        val travel: MutableMap<String, MutableMap<String, MutableList<String>>> = mutableMapOf(
            "Италия" to mutableMapOf(
                "Рим" to mutableListOf("Колизей", "Фонтан Треви"),
                "Флоренция" to mutableListOf("Дуомо", "Галерея Уффици")
            ),
            "Япония" to mutableMapOf(
                "Токио" to mutableListOf("Синдзюку Гёэн", "Сэнсодзи"),
                "Киото" to mutableListOf("Фусими Инари", "Кинкакудзи")
            )
        )

        println("library = $library")
        println("plants = $plants")
        println("quarterFinals = $quarterFinals")
        println("treatment = $treatment")
        println("travel = $travel")

    }
}
