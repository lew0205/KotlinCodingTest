package BaekJoon.IO._2440_별찍기3

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val size = br.readLine().toInt()
    for (i in 1..size) {
        for (j in i..size) bw.write("*")
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}