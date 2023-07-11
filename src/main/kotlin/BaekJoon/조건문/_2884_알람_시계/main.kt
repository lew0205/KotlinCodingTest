package BaekJoon.조건문._2884_알람_시계

import java.io.*
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())
    var h = st.nextToken().toInt()
    var m = st.nextToken().toInt()

    if (m < 45) {
        if (h == 0) h = 23
        else h--
        m += 15
    } else m -= 45
    val sb = StringBuilder()
    sb.append("$h $m")
    print(sb)
}