package BaekJoon.조건문._14681_사분면_고르기

import java.io.*
import java.lang.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val x = readLine().toInt()
    val y = readLine().toInt()

    val sb = StringBuilder()

    if (x > 0) {
        if (y > 0) sb.append(1)
        else sb.append(4)
    } else {
        if (y > 0) sb.append(2)
        else sb.append(3)
    }
    print(sb)
}