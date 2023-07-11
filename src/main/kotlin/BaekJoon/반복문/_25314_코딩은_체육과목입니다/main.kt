package BaekJoon.반복문._25314_코딩은_체육과목입니다

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()

    val sb = StringBuilder()
    for (i in 0 until N / 4) {
        sb.append("long ")
    }
    sb.append("int")
    println(sb)
}