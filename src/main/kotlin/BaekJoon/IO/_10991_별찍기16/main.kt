package BaekJoon.IO._10991_별찍기16

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var starCount = 0
    var spaceCount = 0

    for (i in 1..n) {
        starCount = i
        spaceCount = n - i
        bw.write(" ".repeat(spaceCount))
        bw.write("* ".repeat(starCount))
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}