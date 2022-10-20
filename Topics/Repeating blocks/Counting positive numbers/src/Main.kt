fun main() {
    // put your code here
    val numRep = readln().toInt()
    var totalPositive = 0

    repeat(numRep) {
        val inNum = readln().toInt()
        if (inNum > 0) {
            totalPositive += 1
        }
    }
    println(totalPositive)
}