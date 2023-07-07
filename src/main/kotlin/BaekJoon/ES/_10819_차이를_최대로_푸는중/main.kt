package BaekJoon.ES._10819_차이를_최대로_푸는중

import java.io.*
import java.lang.StringBuilder
import java.util.StringTokenizer
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    val arr = IntArray(n) { st.nextToken().toInt() }
    val sb = StringBuilder()

    for (i in 0 until n - 1) {
        var max = 0
        for (j in i + 1 until n) {
            if (max < abs(arr[i] - arr[j])) {
                max = abs(arr[i] - arr[j])

                var temp = 0
                temp = arr[i + 1]
                arr[i + 1] = arr[j]
                arr[j] = temp
            }
        }
    }
    var result = 0
    for (i in 0 until n - 1) {
        result += abs(arr[i] - arr[i + 1])
        sb.append("${arr[i]} ")
    }
    sb.append("\n")
    sb.append("$result")
    print(sb)
}