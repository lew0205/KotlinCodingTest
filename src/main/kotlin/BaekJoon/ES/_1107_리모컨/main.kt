package BaekJoon.ES._1107_리모컨

import java.io.*
import java.util.*
import kotlin.math.abs
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val n = readLine().toInt()
    val xBtnAmount = readLine().toInt()
    var xBtn = IntArray(xBtnAmount)
    if (xBtnAmount > 0) {
        val st = StringTokenizer(readLine())
        xBtn = IntArray(xBtnAmount) { st.nextToken().toInt() }
    }
    val sb = StringBuilder()
    var answer = abs(n - 100)

    var idx = 0
    var cnt: Int
    for (i in 0..1000000) {
        cnt = 0
        var num = i
        var canCheck = true
        while (num > 0) {
            if (xBtn.contains(num % 10)) {
                canCheck = false
                break
            }
            num /= 10
            cnt++
        }
        if (i == 0) {
            cnt = 1
            if (xBtn.contains(0)) canCheck = false
        }

        if (canCheck) {
            answer = min(answer, abs(n - i) + cnt)
        }
    }
    sb.append("$answer")
    print(sb)
}