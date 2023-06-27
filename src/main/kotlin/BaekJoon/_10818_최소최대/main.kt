package BaekJoon._10818_최소최대

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val size = br.readLine().toInt()
    val temp = br.readLine().split(" ")
    val list = mutableListOf<Int>()
    for (i in 0 until size) {
        list.add(temp[i].toInt())
    }
    val max = list.max()
    val min = list.min()
    bw.write("$min $max")
    bw.flush()
    bw.close()
}