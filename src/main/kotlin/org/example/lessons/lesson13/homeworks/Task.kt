package org.example.org.example.lessons.lesson13.homeworks

class Task {
    // = 1️⃣ Среднее время выполнения теста =
    val testTimes = mapOf("testLogin" to 5.3, "testCheckout" to 8.2, "testSearch" to 6.5)
    val averageTime = testTimes.values.average()
    println("Среднее время выполнения: $averageTime сек.")

    // = 2️⃣ Список всех тестовых методов =
    val testMeta = mapOf("testLogin" to "UI test", "testCheckout" to "Smoke", "testSearch" to "Regression")
    println("Методы: ${testMeta.keys}")

    // = 3️⃣ Добавление нового теста =
    val testResults = mutableMapOf("testLogin" to "passed", "testCheckout" to "failed")
    testResults["testSearch"] = "passed"
    println(testResults)

    // = 4️⃣ Подсчет успешных тестов =
    val passedCount = testResults.count { it.value == "passed" }
    println("Успешных тестов: $passedCount")

    // = 5️⃣ Удаление исправленного бага =
    val bugs = mutableMapOf("BUG-101" to "fixed", "BUG-102" to "open")
    bugs.remove("BUG-101")
    println(bugs)

    // Сообщение о статусе страницы =
    val pageStatuses = mapOf("index.html" to 200, "about.html" to 404)
    pageStatuses.forEach { (page, status) ->
        println("Страница $page — статус $status")
    }

    // Фильтрация по порогу времени ответа =
    val serviceTimes = mapOf("auth" to 200, "catalog" to 800, "checkout" to 1200)
    val slowServices = serviceTimes.filterValues { it > 500 }
    println(slowServices)

    // Получение статуса по endpoint
    val apiResults = mapOf("GET /users" to "200 OK")
    val status = apiResults.getOrElse("GET /orders") { "not tested" }
    println(status)

    // = Получение значения browserType
    val config = mapOf("browserType" to "Chrome", "env" to "QA")
    val browser = config.getValue("browserType")
    println(browser)

    // Копия словаря с новой версией
    val versions = mapOf("App" to "1.0", "API" to "2.0")
    val updatedVersions = versions + ("App" to "1.1")
    println(updatedVersions)

    // Настройки по умолчанию
    val deviceSettings = mapOf("Pixel 7" to "Android 14", "iPhone 13" to "iOS 17")
    val model = "Samsung S22"
    val settings = deviceSettings.getOrDefault(model, "Default settings")
    println(settings)

    // Проверка наличия кода ошибки
    val errors = mapOf(404 to "Not Found", 500 to "Internal Error")
    println(errors.containsKey(404))

    //  Фильтрация по версии
    val tests = mapOf("TestA_v1" to "Passed", "TestB_v2" to "Failed", "TestC_v1" to "Skipped")
    val version = "v1"
    val filtered = tests.filterKeys { it.contains(version) }
    println(filtered)

    // Есть ли модули с неудачным тестированием
    val modules = mapOf("auth" to "passed", "catalog" to "failed")
    val hasFailed = modules.any { it.value == "failed" }
    println(hasFailed)

    // Добавление настроек из другого словаря
    val baseSettings = mutableMapOf("env" to "QA")
    val newSettings = mapOf("region" to "EU", "mode" to "debug")
    baseSettings.putAll(newSettings)
    println(baseSettings)

    // Объединение двух неизменяемых словарей
    val bugs1 = mapOf("BUG-1" to "open")
    val bugs2 = mapOf("BUG-2" to "fixed")
    val merged = bugs1 + bugs2
    println(merged)

    // Очистка изменяемого словаря
    val tempData = mutableMapOf("run1" to "ok", "run2" to "fail")
    tempData.clear()
    println(tempData)

    // Исключение skipped-тестов
    val results = mapOf("t1" to "passed", "t2" to "skipped", "t3" to "failed")
    val filteredNotSkipped = results.filterNot { it.value == "skipped" }
    println(filteredNotSkipped)

    // Копия без нескольких конфигураций
    val configs = mapOf("browser" to "Chrome", "region" to "EU", "env" to "QA")
    val cleaned = configs - listOf("region", "env")
    println(cleaned)

    // Преобразование в отчет
    val testMap = mapOf("T001" to "Passed", "T002" to "Failed")
    val report = testMap.map { "Test ${it.key}: ${it.value}" }
    println(report)

    //  Преобразование изменяемого в неизменяемый
    val mutable = mutableMapOf("t1" to "ok", "t2" to "fail")
    val immutable = mutable.toMap()
    println(immutable)

    // Замена ID на строку
    val testDurations = mapOf(1 to 3.4, 2 to 5.0)
    val stringKeys = testDurations.mapKeys { it.key.toString() }
    println(stringKeys)

    //  Увеличение значений на 10%
    val performance = mapOf("v1.0" to 200.0, "v1.1" to 180.0)
    val adjusted = performance.mapValues { it.value * 1.1 }
    println(adjusted)

    // Проверка, пуст ли словарь
    val compileErrors = emptyMap<String, String>()
    println(compileErrors.isEmpty())

    //  Проверка, что словарь не пуст
    val loadResults = mapOf("test1" to "ok")
    println(loadResults.isNotEmpty())

    // Все тесты успешны
    val testsResults = mapOf("t1" to "passed", "t2" to "passed")
    println(testsResults.all { it.value == "passed" })

// Есть ли хотя бы один с ошибкой
    println(testsResults.any { it.value == "failed" })

    // Отфильтровать optional и failed
    val serviceTests = mapOf("optionalTest1" to "failed", "coreTest" to "passed")
    val optionalFailed = serviceTests.filter { it.key.contains("optional") && it.value != "passed" }
    println(optionalFailed)
}