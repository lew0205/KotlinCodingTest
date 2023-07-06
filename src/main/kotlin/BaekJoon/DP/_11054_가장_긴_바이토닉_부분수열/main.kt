package BaekJoon.DP._11054_가장_긴_바이토닉_부분수열

import java.io.*
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val arr = IntArray(n + 1)
    val dp = Array(n + 1) { IntArray(2) { 1 } }

    var cnt = 1
    readLine().split(" ").forEach { arr[cnt++] = it.toInt() }

    for (i in 1..n) {
        for (j in 1 until i) {
            if (arr[i] > arr[j]) dp[i][0] = max(dp[i][0], dp[j][0] + 1)
        }
    }
    for (i in n downTo 1) {
        for (j in n downTo i + 1) {
            if (arr[i] > arr[j]) dp[i][1] = max(dp[i][1], dp[j][1] + 1)
        }
    }

    var max = 0
    dp.forEach {
        max = max(max, it[0] + it[1] - 1)
    }
    print("$max")
}