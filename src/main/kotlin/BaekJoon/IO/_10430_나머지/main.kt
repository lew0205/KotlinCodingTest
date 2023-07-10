package BaekJoon.IO._10430_나머지

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val sb = StringBuilder()
    val st = StringTokenizer(readLine())
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val c = st.nextToken().toInt()

    sb.append((a + b) % c)
    sb.append("\n")
    sb.append(((a % c) + (b % c)) % c)
    sb.append("\n")
    sb.append((a * b) % c)
    sb.append("\n")
    sb.append(((a % c) * (b % c)) % c)
    print(sb)
}