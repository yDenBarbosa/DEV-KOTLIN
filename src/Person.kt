class Person {
    var name: String = "John Doe"
    var age: Int = 25
    var isEmployed: Boolean = false
    var height: Double = 1.80
    var weight: Float = 70.0f
    var hobbies: List<String> = listOf("gaming", "traveling", "photography")

    fun displayInfo() {
        println("Name: $name")
        println("Age: $age")
        println("Employed: $isEmployed")
        println("Height: $height m")
        println("Weight: $weight kg")
        println("Hobbies: ${hobbies.joinToString(", ")}")
    }
}