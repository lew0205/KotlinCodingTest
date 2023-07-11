package BaekJoon.조건문._2525_오븐_시계

import java.io.*
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())
    var h = st.nextToken().toInt()
    var m = st.nextToken().toInt()
    val n = readLine().toInt()

    m += n
    while (m >= 60) {
        h++
        m -= 60
    }
    if (h > 23) h -= 24

    val sb = StringBuilder()
    sb.append("$h $m")
    print(sb)
}