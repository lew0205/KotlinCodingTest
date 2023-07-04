package BaekJoon.IO._10992_별찍기17

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var starCount = 0
    var spaceCount = 0
    var midSpaceCount = 0

    for (i in 1..n) {
        starCount = i
        spaceCount = n - i
        midSpaceCount = if (i < 2) 0 else i - 2
        bw.write(" ".repeat(spaceCount))
        if (i == n || i == 1) {
            bw.write("*")
            bw.write("**".repeat(starCount - 1))
        } else bw.write("*" + " " + " ".repeat(midSpaceCount * 2) + "*")
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}