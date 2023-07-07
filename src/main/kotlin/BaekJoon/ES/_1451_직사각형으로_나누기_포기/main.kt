package BaekJoon.ES._1451_직사각형으로_나누기_포기

import java.io.*
import java.lang.StringBuilder
import java.util.StringTokenizer
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val st = StringTokenizer(readLine())
    val N = st.nextToken().toInt() // 세로
    val M = st.nextToken().toInt() // 가로
    val bigRectangle = Array(N) { IntArray(M) }

    val sb = StringBuilder()

    for (i in 0 until N) {
        val temp = readLine().chunked(1)
        for (j in 0 until M) {
            bigRectangle[i][j] = temp[j].toInt()
        }
    }

    var max = 0

    while (true) {
        var smallRectangle = IntArray(3) { 0 }
        val x = IntArray(3) { 1 }
        val y = IntArray(3) { 1 }

        if (M >= 3)
            for (i in 0 until M - 2) {
                for (cnt in 0..N) {
                    smallRectangle[0] += bigRectangle[cnt][i]
                }
                for (j in i until M - 1) {
                    for (cnt in 0..N) {
                        smallRectangle[1] += bigRectangle[cnt][i]
                    }
                    for (k in j until M) {
                        for (cnt in 0..N) {
                            smallRectangle[2] += bigRectangle[cnt][i]
                            max = max(max, smallRectangle[0] * smallRectangle[1] * smallRectangle[2])
                        }

                    }
                }
            }
    }

}