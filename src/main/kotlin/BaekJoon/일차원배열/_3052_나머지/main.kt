package BaekJoon.일차원배열._3052_나머지

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val arr = IntArray(10) { 0 }
    var answer = mutableListOf<Int>()

    for (i in arr.indices) {
        arr[i] = readLine().toInt() % 42
    }
    for (i in arr.indices) {
        if (!answer.contains(arr[i])) answer.add(arr[i])
    }

    val sb = StringBuilder()
    sb.append(answer.size)
    println(sb)
}