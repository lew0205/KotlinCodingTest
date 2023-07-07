package BaekJoon.ES._1476_날짜_계산

import java.io.*
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val st = StringTokenizer(readLine())
    val ESM = IntArray(3) { st.nextToken().toInt() }

    val es = IntArray(3) { 1 }
    var year = 1
    while (!es.contentEquals(ESM)) {
        year++
        for (i in 0..2) es[i]++
        if (es[0] > 15) es[0] = 1
        if (es[1] > 28) es[1] = 1
        if (es[2] > 19) es[2] = 1
    }
    val sb = StringBuilder()
    sb.append("$year")
    print(sb)
}