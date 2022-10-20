fun main() {
    // write your code here
    val inputA = readln().toInt()
    val inputB = readln().toInt()
    val inputH = readln().toInt()

    if (inputH < inputA) {
        println("Deficiency")
    } else if (inputH > inputB) {
        println("Excess")
    } else {
        println("Normal")
    }
}