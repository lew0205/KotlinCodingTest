package BaekJoon._2446_별찍기9

import java.io.*
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var starCount = 0
    var spaceCount = 0

    for (i in 1 until n * 2) {
        starCount = abs(n - i)
        spaceCount = if (i > n) n * 2 - i - 1 else i - 1
        for (j in 1..spaceCount) bw.write(" ")
        for (j in 1..starCount * 2) bw.write("*")
        bw.write("*")
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}