package BaekJoon.일차원배열._10818_공넣기

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine())
    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()

    val bascket = IntArray(N + 1) { 0 }

    for (i in 1..M) {
        st = StringTokenizer(readLine())
        val s = st.nextToken().toInt()
        val e = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        for (j in s..e) {
            bascket[j] = b
        }
    }

    val sb = StringBuilder()
    for (i in 1..N) {
        sb.append("${bascket[i]} ")
    }
    println(sb)
}