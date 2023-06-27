package BaekJoon._2438_별찍기1

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val size = br.readLine()
    for (i in 1..size.toInt()) {
        for (j in 1..i) {
            bw.write("*")
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}