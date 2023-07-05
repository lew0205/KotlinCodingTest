package BaekJoon.DP._9465_스티커

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val cnt = br.readLine().toInt()

    for (i in 1..cnt) {

        val len = br.readLine().toInt()
        val dp = Array(3) { Array(len + 1) { 0 } }

        for (j in 1..2) {

            var idx = 1
            br.readLine().split(" ").forEach { dp[j][idx++] = it.toInt() }
        }
        for (j in 2..len) {
            dp[1][j] += Math.max(dp[2][j - 1], dp[2][j - 2])
            dp[2][j] += Math.max(dp[1][j - 1], dp[1][j - 2])
        }
        bw.write(Math.max(dp[1][len], dp[2][len]).toString())
        bw.newLine()
    }
    bw.flush()
    bw.close()
}