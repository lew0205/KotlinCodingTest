package BaekJoon.DP._2193_이친수

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val N = br.readLine().toInt()

    val dp = Array(N + 1) { 0 }
    dp[0] = 0
    dp[1] = 1

    for (i in 2..N) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }

    bw.write(dp[N].toString())
    bw.flush()
    bw.close()
}