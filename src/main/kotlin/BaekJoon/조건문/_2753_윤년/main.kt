package BaekJoon.조건문._2753_윤년

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()

    val sb = StringBuilder()
    if ((n % 4 == 0) && ((n % 100 != 0) || n % 400 == 0)) sb.append(1)
    else sb.append(0)
    print(sb)
}