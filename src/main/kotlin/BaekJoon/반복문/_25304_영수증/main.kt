package BaekJoon.반복문._25304_영수증

import java.io.*
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val X = readLine().toInt()
    val N = readLine().toInt()

    var total = 0
    for (i in 0 until N) {
        val st = StringTokenizer(readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        total += a * b
    }

    val sb = StringBuilder()
    if (X == total) sb.append("Yes")
    else sb.append("No")

    print(sb)
}