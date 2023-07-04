package BaekJoon.IO._2442_별찍기5

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val size = br.readLine().toInt()
    for (i in 1..size) {
        for (j in i until size) bw.write(" ")
        for (j in 1 until i) bw.write("**")
        bw.write("*")
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}