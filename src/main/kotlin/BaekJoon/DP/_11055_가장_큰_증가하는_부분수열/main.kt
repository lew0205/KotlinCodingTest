package BaekJoon.DP._11055_가장_큰_증가하는_부분수열

import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val len = readLine().toInt()
    val arr = Array(len + 1) { 0 }
    val dp = Array(len + 1) { 0 }

    var num = 1
    readLine().split(" ").forEach { arr[num++] = it.toInt() }

    for (i in 1..len) {
        dp[i] = arr[i]
        for (j in 1 until i) {
            if (arr[j] < arr[i]) dp[i] = maxOf(dp[i], dp[j] + arr[i])
        }
    }

    print("${dp.maxOrNull()}")
}