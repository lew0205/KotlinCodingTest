package BaekJoon.일차원배열._10811_바구니_뒤집기

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine())
    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()

    val bascket = IntArray(N + 1) { 0 }

    for (i in bascket.indices) {
        if (i == 0) continue
        bascket[i] = i
    }

    for (i in 1..M) {
        st = StringTokenizer(readLine())
        val start = st.nextToken().toInt()
        val end = st.nextToken().toInt()

        bascket.reverse(start, end + 1)
    }

    val sb = StringBuilder()
    for (i in bascket.indices) {
        if (i == 0) continue
        sb.append("${bascket[i]} ")
    }
    println(sb)
}