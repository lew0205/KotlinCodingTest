package BaekJoon.일차원배열._5597_과제안내신분

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val arr = IntArray(30 + 1) { 0 }
    for (i in 0 until 28) {
        arr[readLine().toInt()]++
    }
    var notPart = IntArray(2) { 0 }
    var cnt = 0;
    for (i in 1..30) {
        if (arr[i] == 0) {
            notPart[cnt++] = i
        }
    }
    notPart.sort()
    val sb = StringBuilder()
    sb.append("${notPart[0]}\n${notPart[1]}")
    println(sb)
}