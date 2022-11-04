fun main() {
    // put your code here
    val a : Int = readLine()!!.toInt()
    val b : Int = readLine()!!.toInt()
    val c : Int = readLine()!!.toInt()
    when {
        a != b && a != c && b != c -> println(true)
        else -> println(false)
    }
}