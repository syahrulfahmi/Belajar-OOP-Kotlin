package app

import data.Address
import data.Person

//Belajar Secondary Constructor
fun main() {
    /**
     * Call Secondary Constructor
     */
    val fahmiAddress = Address("Kp. Mangga", "Prov. Durian")
    println(fahmiAddress.villageName)
    println(fahmiAddress.citiesName)

    val syahrulAddress = Address("Kp. Pisang", "Kab. Anggur", "Prov. Pepaya")
    println(syahrulAddress.villageName)

    /**
     * Call secondary constructor without call primary constructor
     */
    val fahmiFirstName1 = Person("Syahrul")
    val fahmiFirstName2 = Person("Syahrul", "Fahmi")
    println(fahmiFirstName1.firstName)
    println(fahmiFirstName2.middleName)
}