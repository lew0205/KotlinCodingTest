package BaekJoon.IO._2742_기찍_N

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val size = br.readLine().toInt()
    for (i in size downTo 1) {
        bw.write("" + i + "\n")
    }
    bw.flush()
    bw.close()
}