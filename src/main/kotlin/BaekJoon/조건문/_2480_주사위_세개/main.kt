package BaekJoon.조건문._2480_주사위_세개

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())
    val dice = IntArray(3) { st.nextToken().toInt() }

    val sb = StringBuilder()
    if (dice[0] == dice[1]) {
        if (dice[1] == dice[2]) sb.append(10000 + dice[0] * 1000)
        else sb.append(1000 + dice[0] * 100)
    } else if (dice[0] == dice[2] || dice[1] == dice[2]) {
        sb.append(1000 + dice[2] * 100)
    } else {
        sb.append(max(dice[0], max(dice[1], dice[2])) * 100)
    }
    print(sb)
}