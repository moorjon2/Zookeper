fun main() {
    // write your code here
    val year = readln().toInt()
    val a = readln()
    val b = readln()

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        println("Leap")
    } else {
        println("Regular")
    }


    val language = "Kotlin"
    println("$language has ${language.length} letters in the name")



    val max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }


    println(max)
}
