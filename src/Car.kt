class Car(var name: String, var model: String, var year: Int) {

    fun displayInfo() {
        println("Car Name: $name, Model: $model, Year: $year")
    }

    fun isVintage(): Boolean {
        return year < 1990
    }

}