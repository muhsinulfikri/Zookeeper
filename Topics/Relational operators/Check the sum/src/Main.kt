fun main() {
    // put your code here
    val a : Int = readLine()!!.toInt()
    val b : Int = readLine()!!.toInt()
    val c : Int = readLine()!!.toInt()

    when {
        a + b == 20 -> println(true)
        a + c == 20 -> println(true)
        b + c == 20 -> println(true)
        else -> println(false)
    }

}
