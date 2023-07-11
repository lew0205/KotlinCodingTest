package BaekJoon.일차원배열._10807_개수_세기

import java.io.*
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()
    val st = StringTokenizer(readLine())
    val arr = IntArray(N) { st.nextToken().toInt() }
    val v = readLine().toInt()

    var cnt = 0

    for (i in arr.indices) {
        if (arr[i] == v) cnt++
    }

    val sb = StringBuilder()
    sb.append(cnt)
    println(cnt)
}