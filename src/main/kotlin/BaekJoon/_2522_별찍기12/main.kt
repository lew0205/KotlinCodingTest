package BaekJoon._2522_별찍기12

import java.io.*
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var starCount = 0
    var spaceCount = 0

    for (i in 1 until n * 2) {
        starCount = if (i > n) n * 2 - i else i
        spaceCount = abs(n - i)
        for (j in 1..spaceCount) bw.write(" ")
        for (j in 1..starCount) bw.write("*")
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}