package BaekJoon.DP._11722_가장_긴_감소하는_부분수열

import java.io.*
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    val n = readLine().toInt()
    val dp = IntArray(n + 1) { 1 }
    val arr = IntArray(n + 1)

    var a = 1;
    readLine().split(" ").forEach { arr[a++] = it.toInt() }

    for (i in 1..n) {
        for (j in 1 until i) {
            if (arr[j] > arr[i]) dp[i] = max(dp[i], dp[j] + 1)
        }
    }

    print("${dp.max()}")
}