package BaekJoon.DP._9095_123더하기

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val dp = arrayOfNulls<Int>(1000001)
    dp[0] = 0
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4

    val times = br.readLine().toInt()

    for (i in 1..times) {
        val num = br.readLine().toInt()


        for (j in 4..num) {
            dp[j] = dp[j - 1]!! + dp[j - 2]!! + dp[j - 3]!!
        }

        bw.write(dp[num].toString())
        bw.newLine()
    }
    bw.flush()
    bw.close()
}