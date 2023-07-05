package BaekJoon.DP._10844_쉬운계단수

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val N = br.readLine().toInt()
    val dp = Array(N + 1) { Array(10) { 0 } }

    dp[1][0] = 0

    for (i in 1..9) {
        dp[1][i] = 1
    }

    for (i in 2..N) {
        for (j in 0..9) {
            when (j) {
                0 -> dp[i][j] = dp[i - 1][j + 1]
                9 -> dp[i][j] = dp[i - 1][j - 1]
                else -> dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000
            }
        }
    }
    var result = 0L
    dp[N].forEach { x -> result += x }
    result %= 1000000000
    bw.write(result.toString())
    bw.flush()
    bw.close()
}