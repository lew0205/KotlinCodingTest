package BaekJoon.일차원배열._10871_X보다_작은_수

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine())
    val N = st.nextToken().toInt()
    val X = st.nextToken().toInt()

    st = StringTokenizer(readLine())
    val A = IntArray(N) { st.nextToken().toInt() }

    val sb = StringBuilder()
    for (i in A.indices) {
        if (A[i] < X) sb.append("${A[i]} ")
    }

    print(sb)
}