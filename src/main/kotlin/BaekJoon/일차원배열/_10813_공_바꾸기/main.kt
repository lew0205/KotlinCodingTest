package BaekJoon.일차원배열._10813_공_바꾸기

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine())
    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()

    val bascket = IntArray(N + 1) { 0 }

    for (i in 1..N) {
        bascket[i] = i
    }

    for (i in 1..M) {
        st = StringTokenizer(readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        val temp = bascket[a]
        bascket[a] = bascket[b]
        bascket[b] = temp
    }

    val sb = StringBuilder()
    for (i in 1..N) {
        sb.append("${bascket[i]} ")
    }
    println(sb)
}