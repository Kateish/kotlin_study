package org.example.org.example.lessons.lesson08.homeworks
fun main(){
    val phrases = listOf(
        "Это невозможно выполнить за один день",
        "Я не уверен в успехе этого проекта",
        "Произошла катастрофа на сервере",
        "Этот код работает без проблем",
        "Удача"
    )
    for (phrase in phrases) {
        println(transform(phrase))
    }
}
// 1) Преобразование строк
fun transform(string: String): String{
   var result = string
    if (result.contains("невозможно"))
        result = result.replace("невозможно", "совершенно точно возможно, просто требует времени")

    if (result.startsWith("Я не уверен"))
        result += ", но моя интуиция говорит об обратном"

    if (result.contains("катастрофа"))
        result = result.replace("катастрофа", "интересное событие")

    if (result.endsWith("без проблем"))
        result = result.replace("без проблем", "с парой интересных вызовов на пути")

    if (result.trim().split(" ").size == 1)
        result = "Иногда, $result, но не всегда"

    return result
}
/* 2. Извлечение даты и времени */
fun extractDateTime(log: String) {
    val parts = log.split("->")
    val dateTime = parts.last().trim().split(" ")
    println("Дата: ${dateTime[0]}")
    println("Время: ${dateTime[1]}")
}
/* 3. Маскирование карты */
fun maskCard(card: String): String {
    val clean = card.replace(" ", "")
    val hidden = "*".repeat(clean.length - 4) + clean.takeLast(4)
    return hidden.chunked(4).joinToString(" ")
}

/* 4. Форматирование email */
fun formatEmail(email: String): String =
    email.replace("@", " [at] ").replace(".", " [dot] ")

/* 5. Извлечение имени файла */
fun getFileName(path: String): String =
    path.substringAfterLast('/', path)

/* 6. Аббревиатура */
fun makeAbbr(text: String): String {
    var abbr = ""
    for (word in text.split(" ")) {
        if (word.isNotEmpty()) abbr += word[0].uppercaseChar()
    }
    return abbr
}