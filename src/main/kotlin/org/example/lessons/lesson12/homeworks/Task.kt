package org.example.org.example.lessons.lesson12.homeworks

class Task {
    //    Задачи на приведение коллекции к значению
//    Проверить, что размер коллекции больше 5 элементов.
    fun moreThan5(list: List<Int>) = list.size > 5

    //    Проверить, что коллекция пустая
    fun isEmpty(list: List<Int>) = list.isEmpty()

    //    Проверить, что коллекция не пустая
    fun notEmpty(list: List<Int>) = list.isNotEmpty()

    //    Взять элемент по индексу или создать значение если индекса не существует
    fun indices(list: List<Int>, index: Int, default: Int) =
        list.getOrElse(index) { default }

    //    Собрать коллекцию в строку
    fun joinString(list: List<Int>, separator: String = ", ") =
        list.joinToString(separator)

    //    Посчитать сумму всех значений
    fun sumOf(list: List<Int>) = list.sum()

    //    Посчитать среднее
    fun averageOf(list: List<Int>) = list.average()

    //    Взять максимальное число
    fun max(list: List<Int>) = list.maxOrNull()

    //    Взять минимальное число
    fun min(list: List<Int>) = list.minOrNull()

    //    Взять первое число или null
    fun firstOrNullOf(list: List<Int>) = list.firstOrNull()

    //    Проверить что коллекция содержит элемент
    fun containsValue(list: List<Int>, value: Int) = (value in list)

    //    Задачи на обработку коллекций
//    Отфильтровать коллекцию по диапазону 18-30
    fun filter18to30(list: List<Int>) = list.filter { it in 18..30 }

    //    Выбрать числа, которые не делятся на 2 и 3 одновременно
    fun notDivisibleBy2And3(list: List<Int>) =
        list.filterNot { it % 2 == 0 && it % 3 == 0 }

    //    Очистить текстовую коллекцию от null элементов
    fun removeNulls(list: List<String?>) = list.filterNotNull()

    //    Преобразовать текстовую коллекцию в коллекцию длин слов
    fun mapToLengths(words: List<String>) = words.map { it.length }

    //    Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов
    fun rev(words: List<String>) =
        words.associate { it.reversed() to it.length }

    //    Отсортировать список в алфавитном порядке
    fun sortAlphabetically(words: List<String>) = words.sorted()

    //    Взять первые 3 элемента списка
    fun take3(list: List<Int>) = list.take(3)

    //    Распечатать квадраты элементов списка
    fun printSquares(list: List<Int>) = list.forEach { println(it * it) }

    //    Группировать список по первой букве слов
    fun groupByFirstLetter(words: List<String>) =
        words.groupBy { it.first() }

    //    Очистить список от дублей
    fun doubles(list: List<Int>) = list.distinct()

    //    Отсортировать список по убыванию
    fun sortDescending(list: List<Int>) = list.sortedDescending()

    //    Взять последние 3 элемента списка
    fun takeLast3(list: List<Int>) = list.takeLast(3)

    //Задача 24. Характеристика числовой коллекции
    fun collectionz(nums: List<Int>): String = when {
        nums.isEmpty() -> "Пусто"
        nums.size < 5 -> "Короткая"
        nums.firstOrNull() == 0 -> "Стартовая"
        nums.sum() > 10_000 -> "Массивная"
        nums.isNotEmpty() && nums.average() == 10.0 -> "Сбалансированная"
        nums.joinToString("").length == 20 -> "Клейкая"
        (nums.maxOrNull() ?: Int.MIN_VALUE) < -10 -> "Отрицательная"
        (nums.minOrNull() ?: Int.MAX_VALUE) > 1_000 -> "Положительная"
        (3 in nums) && (14 in nums) -> "Пи***тая"
        else -> "Уникальная"
    }

    // Задача 25. Анализ учебных оценок
    fun top3analyze(marks: List<Int>): List<Int> =
        marks.filter { it >= 60 }
            .sorted()
            .take(3)

    //Задача 26. Создание каталога по первой букве
    fun byFirstLetter(items: List<String>): Map<Char, List<String>> =
        items.map { it.lowercase() }
            .groupBy { it.first() }

    //Задание 27. Подсчёт средней длины слов в списке
    fun avgs(items: List<String>): String {
        val avg = items.map { it.length }.average()
        return "%.2f".format(avg)
    }

    //Задание 28: Категоризация чисел
    fun categorize(numbers: List<Int>): Map<String, List<Int>> =
        numbers.distinct()
            .sortedDescending()
            .groupBy { if (it % 2 == 0) "четные" else "нечетные" }

    //Задание 29: Поиск первого подходящего элемента
    fun firstN(ages: List<Int?>, threshold: Int): Int? =
        ages.filterNotNull()
            .firstOrNull { it > threshold }

}