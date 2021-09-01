package data

class Car(paramBrand: String, paramYear: Int) {
    /**
     * Initializer Block
     *
     * initializer block adalah blok kode yang akan langsung di eksekusi ketika constructor di panggil
     */
    init {
        println("Car $paramBrand di buat")
    }
    /**
     * property class
     */
    var brand = paramBrand
    var year = paramYear
}