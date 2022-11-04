import kotlin.math.max
import kotlin.time.seconds

fun main() {
    // put your code here
    val input = readLine()!!.toInt()
    var max = 0
    repeat(input){
        var num = readLine()!!.toInt()
        if (num % 4 == 0 && num > max){
            max = num
        }
    }
    println(max)
}
