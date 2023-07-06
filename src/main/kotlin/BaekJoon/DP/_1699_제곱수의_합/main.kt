package BaekJoon.DP._1699_제곱수의_합

import java.io.*
import java.lang.StringBuilder
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val n = readLine().toInt()

    val dp = IntArray(n + 1) { 0 }

    for (i in 0..n) {
        dp[i] = i
    }

    for (i in 4..n) {
        var j = 2
        while (j * j <= i) {
            dp[i] = min(dp[i - (j * j)] + 1, dp[i])
            j++
        }
    }
    val sb = StringBuilder()
    sb.append(dp[n])
    print(sb)
}