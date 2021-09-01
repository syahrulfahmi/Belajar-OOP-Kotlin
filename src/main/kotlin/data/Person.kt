package data

class Person {
    var firstName: String = ""
    var middleName: String = ""

    /**
     * Membuat secondary constructor tanpa memanggil primary constructornya memiliki kelemahan, yaitu
     * kita tidak dapat langsung mengambil nilai dari parameter constructornya melainkan harus di assign/dimasukan
     * kedalam propertinya terlebih dahulu
     */
    constructor(paramFirstName: String, paramMiddleName: String) {
        firstName = paramFirstName
        middleName = paramMiddleName
    }

    constructor(paramFirstName: String) : this (paramFirstName, "")
}