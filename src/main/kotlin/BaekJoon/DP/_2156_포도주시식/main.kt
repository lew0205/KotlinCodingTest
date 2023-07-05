package BaekJoon.DP._2156_포도주시식

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val N = br.readLine().toInt()

    val grape = Array(N + 1) { 0 }
    val dp = Array(N + 1) { 0 }

    for (i in 1..N) {
        grape[i] = br.readLine().toInt()
    }

    for (i in 1..N) {
        when (i) {
            1 -> dp[i] = grape[i]
            2 -> dp[i] = grape[i] + grape[i - 1]
            else -> {
                dp[i] = Math.max(dp[i-1], Math.max((dp[i - 2] + grape[i]), (dp[i - 3] + grape[i] + grape[i - 1])))
            }
        }
    }

    bw.write(dp[N].toString())
    bw.flush()
    bw.close()
}