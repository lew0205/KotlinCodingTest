package BaekJoon._2739_구구단

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine().toInt()

    for (i in 1..9) {
        bw.write("$num * $i = ${num * i}\n")
    }
    bw.flush()
    bw.close()
}