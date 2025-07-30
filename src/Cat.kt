sealed class Cat {
    data class Domestic(val name: String, val age: Int) : Cat()
    data class Wild(val species: String, val habitat: String) : Cat()
}

