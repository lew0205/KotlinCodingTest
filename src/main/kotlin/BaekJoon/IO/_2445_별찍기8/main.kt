package BaekJoon.IO._2445_별찍기8

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val size = br.readLine().toInt()
    for (i in 1..size) {
        for (j in 1..i) bw.write("*")
        for (j in i until size) bw.write("  ")
        for (j in 1..i) bw.write("*")
        bw.write("\n")
    }
    for (i in size - 1 downTo 1) {
        for (j in 1..i) bw.write("*")
        for (j in i until size) bw.write("  ")
        for (j in 1..i) bw.write("*")
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}