package app

import data.Animal

// Belajar Object
fun main() {
    /**
     * Object/instance adalah hasil deklarasi dari sebuah kelas
     */
    val animal = Animal()
    animal.animalName = "Kuda"
    println(animal.animalName)
}