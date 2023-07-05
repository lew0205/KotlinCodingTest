package BaekJoon.DP._11726_2xN타일링

import java.io.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine().toInt()

    val dp = arrayOfNulls<Int>(1000001)

    dp[1] = 1
    dp[2] = 2

    for (i in 3..num) {
        dp[i] = (dp[i - 1]!! + dp[i - 2]!!) % 10007
    }

    bw.write(dp[num].toString())
    bw.flush()
    bw.close()
}