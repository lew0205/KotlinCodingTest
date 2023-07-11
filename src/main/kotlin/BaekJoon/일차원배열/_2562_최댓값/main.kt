package BaekJoon.일차원배열._2562_최댓값

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var max = 0
    var idx = 0
    for (i in 0..8) {
        val n = readLine().toInt()
        max = max(max, n)
        if (n == max) idx = i + 1
    }

    val sb = StringBuilder()
    sb.append("$max\n")
    sb.append("$idx")
    println(sb)
}