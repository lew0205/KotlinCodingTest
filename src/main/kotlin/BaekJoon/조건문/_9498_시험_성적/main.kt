package BaekJoon.조건문._9498_시험_성적

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()

    val sb = StringBuilder()
    if (n <= 100) {
        if (n >= 90) sb.append("A")
        else if (n >= 80) sb.append("B")
        else if (n >= 70) sb.append("C")
        else if (n >= 60) sb.append("D")
        else sb.append("F")
    }
    print(sb)
}