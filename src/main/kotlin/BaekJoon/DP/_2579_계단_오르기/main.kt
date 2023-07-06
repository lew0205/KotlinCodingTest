package BaekJoon.DP._2579_계단_오르기

import java.io.*
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val n = readLine().toInt()

    val stairs = IntArray(n) { 0 }

    for (i in 0 until n) {
        stairs[i] = readLine().toInt()
    }

    val dp = IntArray(n) { 0 }
    if (n > 0) dp[0] = stairs[0]
    if (n > 1) dp[1] = dp[0] + stairs[1]
    if (n > 2) dp[2] = max(dp[0], stairs[1]) + stairs[2]

    for (i in 3 until n) {
        dp[i] = max(dp[i - 3] + stairs[i - 1] + stairs[i], dp[i - 2] + stairs[i])
    }

    val sb = StringBuilder()
    sb.append("${dp[n - 1]}")
    print(sb)
}