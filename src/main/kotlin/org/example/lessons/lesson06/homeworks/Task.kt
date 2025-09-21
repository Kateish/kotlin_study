package org.example.org.example.lessons.lesson06.homeworks

class Task {
    fun printSeason(month: Int) {
        when (month) {
            in 1..2 -> println("Зима")
            in 3..5 -> println("Весна")
            in 6..8 -> println("Лето")
            in 9..11 -> println("Осень")
            12 -> println("Зима")
            else -> println("Неправильный номер месяца")
        }
    }

    fun printDogAge(dogYears: Double) {
        if (dogYears <= 2) {
            println("Собаке " + dogYears * 10.5)
        } else {
            println("Собаке " + 21 + (dogYears - 2) * 4)
        }
    }

    fun transportType(distance: Double) {
        if (distance <= 1.0) {
            println("пешком")
        } else if (distance <= 5.0) {
            println("велосипед")
        } else {
            println("автотранспорт")
        }
    }

    fun bonusCount(sum: Int) {
        if (sum <= 1000) {
            println("Количество бонусов: " + sum / 100 * 2)
        } else {
            println("Количество бонусов: " + sum / 100 * 3)
        }
    }

    fun docType(extension: String) {
        when (extension) {
            "txt", "rtf", "doc", "docx" -> println("Текстовый файл")
            "png", "jpg", "jpeg", "gif", "bmp", "svg", "heic" -> println("Изображение")
            "xls", "xlsx", "csv" -> println("Таблица")
            else -> println("Неизвестный тип")
        }
    }

    fun tempConverter(value: Double, type: Char) {
        when (type) {
            'C' -> {
                print(value * 9 / 5 + 32)
                print("F")
            }

            'F' -> {
                print((value - 32) * 5 / 9)
                print("C")
            }
        }
    }

    fun chooseOutfit(temp: Int) {
        if (temp < -30 || temp > 35) {
            println("не выходить из дома")
        } else if (temp < 10) {
            println("куртка и шапка")
        } else if (temp in 10..18) {
            println("ветровка")
        } else {
            println("футболка и шорты")
        }
    }


    fun movieChoice(age: Int) {
        when (age) {
            in 0..9 -> "детские"
            in 10..18 -> "подростковые"
            else -> "18+"
        }
    }
}


//Задание 7: "Подбор одежды по погоде"
//
//Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды:
// "куртка и шапка" при температуре ниже +10,
// "ветровка" от +10 до +18 градусов включительно и
// "футболка и шорты" при температуре выше +18 градусов.
// При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.
//
//Задание 8: "Выбор фильма по возрасту"
//
//Кинотеатр предлагает фильмы разных возрастных категорий.
// Напишите функцию, которая принимает возраст зрителя и возвращает доступные
// для него категории фильмов: "детские" (от 0 до 9), "подростковые" (от 10 до 18), "18+" для остальных.
//
