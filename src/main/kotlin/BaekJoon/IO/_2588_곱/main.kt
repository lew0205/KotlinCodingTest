package BaekJoon.IO._2588_곱

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import kotlin.math.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val num1 = readLine().toInt()
    val temp = readLine().chunked(1)
    val num2 = IntArray(3)
    var sum = 0
    val sb = StringBuilder()
    for (i in 0..2) {
        num2[i] = temp[2 - i].toInt()
        sum += (num1 * num2[i]) * (10f.pow(i)).toInt()
        sb.append((num1 * num2[i]).toString() + "\n")
    }
    sb.append(sum)
    print(sb)
}