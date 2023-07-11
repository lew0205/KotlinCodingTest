package BaekJoon.일차원배열._1541_평균

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()
    val st = StringTokenizer(readLine())
    val arr = FloatArray(N) { st.nextToken().toFloat() }

    val M = arr.max()
    var sum = 0.0
    for (i in arr.indices) {
        arr[i] = arr[i] / M * 100
        sum += arr[i]
    }
    val sb = StringBuilder()
    sb.append(sum / N)
    println(sb)
}