package data

// Belajar Secondary Constructor

class Address(street: String, village: String, cities: String, province: String) {
    var streetName = street
    var villageName = village
    var citiesName = cities
    var provinceName = province

    init {
        println("Address $village dibuat")
    }
    /**
     * Secodary Constructor
     *
     * Secondary Constructor adalah constructor tambahan yang bertujuan untuk memberikan lebih banyak opsi
     * untuk memanipulasi property ketika membuat sebuah objek
     */
    constructor(village: String, cities: String, province: String) : this("", village, cities, province) {
        println("secondary constructor 1")
    }

    constructor(village: String, province: String) : this(village, "", province) {
        println("secondary constructor 2")
    }
}