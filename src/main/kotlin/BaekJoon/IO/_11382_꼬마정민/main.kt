package BaekJoon.IO._11382_꼬마정민

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())
    val arr = LongArray(3) { st.nextToken().toLong() }

    val sb = StringBuilder()
    sb.append(arr[0] + arr[1] + arr[2])
    print(sb)
}