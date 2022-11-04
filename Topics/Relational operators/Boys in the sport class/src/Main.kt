fun main() {
    // put your code here
    val h1 : Int = readLine()!!.toInt()
    val h2 : Int = readLine()!!.toInt()
    val h3 : Int = readLine()!!.toInt()
    if (h2 in h3..h1){
        println(true)
    } else if (h2 in h1..h3){
        println(true)
    } else {
        println(false)
    }
}