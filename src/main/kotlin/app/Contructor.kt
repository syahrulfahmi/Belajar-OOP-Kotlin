package app

import data.Car

// Belajar Contructor
fun main() {
    /**
     * contructor adalah fungsi yang akan pertama kali dipanggil ketika membuat sebuah objek
     */
    val avanza = Car("Toyota", 2019)
    println(avanza.brand)
    println(avanza.year)

    val xenia = Car("Daihatsu", 2016)
    println(xenia.brand)
    println(xenia.year)
}