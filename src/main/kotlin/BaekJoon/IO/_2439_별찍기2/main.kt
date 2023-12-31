package BaekJoon.IO._2439_별찍기2

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val size = br.readLine().toInt()
    for (i in 1..size) {
        for (j in size downTo i + 1) bw.write(" ")
        for (j in 1..i) bw.write("*")
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}