package BaekJoon._2741_N_찍기

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val size = br.readLine().toInt()
    for (i in 1..size) {
        bw.write("" + i + "\n")
    }
    bw.flush()
    bw.close()
}