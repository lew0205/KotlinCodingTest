package BaekJoon.DP._1463_1로만들기

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine().toInt()

    var dp = arrayOfNulls<Int>(10001)
    dp[1] = 0
    dp[2] = 1
    dp[3] = 1

    for (i in 4..num) {
        if (i % 6 == 0) {
            dp[i] = Math.min(dp[i / 3]!!, Math.min(dp[i / 2]!!, dp[i - 1]!!)) + 1
        } else if (i % 3 == 0) {
            dp[i] = Math.min(dp[i / 3]!!, dp[i - 1]!!) + 1
        } else if (i % 2 == 0) {
            dp[i] = Math.min(dp[i / 2]!!, dp[i - 1]!!) + 1
        } else {
            dp[i] = dp[i - 1]!! + 1
        }
    }

    bw.write(dp[num]!!.toString())
    bw.flush()
    bw.close()
}