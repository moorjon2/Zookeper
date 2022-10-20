fun main() {
    // put your code here
    val classA = readln().toInt()
    val classB = readln().toInt()
    val classC = readln().toInt()
    
    val classADesks = (classA / 2) % 2
    val classBDesks = (classB / 2) % 2
    val classCDesks = (classC / 2) % 2
    
    val desksTotal = classADesks + classBDesks + classCDesks
    
    println(desksTotal)
}
