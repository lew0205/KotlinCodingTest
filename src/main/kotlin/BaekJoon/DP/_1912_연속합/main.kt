package BaekJoon.DP._1912_연속합

import java.io.*
import java.lang.StringBuilder
import java.util.*
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val sb = StringBuilder()
    val n = readLine().toInt()

    val st = StringTokenizer(readLine())
    val arr =  IntArray(n) { st.nextToken().toInt()  }

    val dp = IntArray(n) { 0 }

    dp[0] = arr[0]
    var max = arr[0]

    for (i in 1 until n) {
        dp[i] = max(arr[i], dp[i - 1] + arr[i])
        max = max(max, dp[i])
    }

    sb.append("$max")
    print(sb)
}