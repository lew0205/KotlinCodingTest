package BaekJoon.DP._11053_가장_긴_증가하는_부분수열

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val len = br.readLine().toInt()
    val arr = Array(len + 1) { 0 }
    val dp = Array(len + 1) { 1 }

    var num = 1
    br.readLine().split(" ").forEach { arr[num++] = it.toInt() }

    for (i in 2..len) {
        for (j in i - 1 downTo 1) {
            if (arr[j] < arr[i]) dp[i] = maxOf(dp[i], dp[j] + 1)
        }
    }

    bw.write(dp.maxOrNull().toString())
    bw.flush()
    bw.close()
}