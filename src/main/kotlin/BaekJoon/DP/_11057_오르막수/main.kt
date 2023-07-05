package BaekJoon.DP._11057_오르막수

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val N = br.readLine().toInt()
    val dp = Array(N + 1) { Array(10) { 0 } }

    for (i in 0..9) {
        dp[1][i] = 1
    }

    for (i in 1..N) {
        for (j in 0..9) {
            for (k in 0..j) {
                dp[i][j] += dp[i - 1][k] % 10007
            }
        }
    }

    var result = 0L
    dp[N].forEach { result += it }
    result %= 10007

    bw.write(result.toString())
    bw.flush()
    bw.close()
}