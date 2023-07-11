package BaekJoon.조건문._1330_두_수_비교하기

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())
    val num1 = st.nextToken().toLong()
    val num2 = st.nextToken().toLong()

    val sb = StringBuilder()
    if (num1 < num2) sb.append("<")
    else if (num1 > num2) sb.append(">")
    else sb.append("==")

    print(sb)
}