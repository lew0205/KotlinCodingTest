package BaekJoon._8393_합

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine()
    var result = 0
    for (i in 1..num.toInt()) {
        result += i
    }
    bw.write(result.toString())
    bw.flush()
    bw.close()
}