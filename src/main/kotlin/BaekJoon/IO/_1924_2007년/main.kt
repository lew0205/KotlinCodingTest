package BaekJoon.IO._1924_2007년

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = br.readLine().split(" ")
    val month = str[0].toInt()
    val day = str[1].toInt()
    var totalDay = 0
    totalDay += day
    for (i in 1 until month) {
        totalDay += when (i) {
            1, 3, 5, 7, 8, 10, 12 -> 31
            4, 6, 9, 11 -> 30
            else -> 28
        }
    }
    val dayOfTheWeek = when (totalDay % 7) {
        1 -> "MON"
        2 -> "TUE"
        3 -> "WED"
        4 -> "THU"
        5 -> "FRI"
        6 -> "SAT"
        else -> "SUN"
    }
    bw.write(dayOfTheWeek)
    bw.flush()
    bw.close()
}