package BaekJoon.IO._1008_A나누기B

import java.io.*
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val st = StringTokenizer(readLine())

    val num1 = st.nextToken().toDouble()
    val num2 = st.nextToken().toDouble()

    val result = num1 / num2

    val sb = StringBuilder()

    sb.append(result)
    print(sb)
}