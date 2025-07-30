fun main() {

//    var client01 = Client("Maria",  30);
//    var client02 = Client("João",  25);
//
//    // Print the client information
//    println("Client 01: ${client01.name}, Age: ${client01.idade}");
//    println("Client 02: ${client02.name}, Age: ${client02.idade}");
//
//
//
//
//    var name: String = "Maria";
//    var age: Int = 30;
//    var isEmployed: Boolean = true;
//    var height: Double = 1.75;
//    var weight: Float = 65.5f;
//    var hobbies: List<String> = listOf("reading", "hiking", "cooking");
//
//    // Print the variables
//
//    println("Name: $name")
//    println("Age: $age")
//    println("Employed: $isEmployed")
//    println("Height: $height m")
//    println("Weight: $weight kg")
//    println("Hobbies: ${hobbies.joinToString(", ")}")
//
//
//    var car01 = Car("Fusca", "Volkswagen", 1985);
//    var car02 = Car("Civic", "Honda", 2020);
//
//    // Display car information
//    car01.displayInfo()
//    car02.displayInfo()
//    println(car01.isVintage())
//    println(car02.isVintage())

//    var cars = mutableListOf("Fusca", "Civic",  "1", "Mustang", "Camaro", "false");
//    cars[0] = "Monza";
//
//    println(cars[0]);
//
//    var motobiciles = arrayOf("Yamaha", "Honda", "Suzuki", "Kawasaki", "Shineray");
//    motobiciles[0] = "Yamaha MT-09";
//    println(motobiciles[0]);
//
//
//    var capitais = hashMapOf(
//        "Brasil" to "Brasília",
//        "Estados Unidos" to "Washington, D.C.",
//        "França" to "Paris",
//        "Alemanha" to "Berlim",
//        "Japão" to "Tóquio"
//    )
//
//    println(capitais["Brasil"])
//
//    capitais["Brasil"] = "Rio de Janeiro";
//
//    capitais["Alemanha"] = "Berlim";
//
//    println(capitais["Brasil"])
////
////    for ((country, capital) in capitais) {
////        println("A capital de $country é $capital")
////    }
//
//    capitais.forEach { (country, capital) ->
//        println("A capital de $country é $capital");
//    }

//    var person = Person()
//    person.name = "Alice";
//    person.age = 28;
//    person.isEmployed = true;
//    person.height = 1.65;
//    person.weight = 55.0f;
//    person.hobbies = listOf("reading", "swimming", "painting");
//    person.displayInfo();

//    var car01 = Car("Fusca", "Volkswagen", 1985);

    //   print(car01.toString());

    var dog01 = Dog("Rex", 5, "Labrador");
    var dog02 = Dog("Bella", 3, "Beagle");

    // println("Dog Name: ${dog01.name}, Age: ${dog01.age}, Breed: ${dog01.breed}");

    //print(dog01.toString());

    //print(dog01.equals(dog02))

    dog02 = dog01.copy(age = 10);

    println("Dog Name: ${dog02.name}, Age: ${dog02.age}, Breed: ${dog02.breed}");
    println("Dog Name: ${dog01.name}, Age: ${dog01.age}, Breed: ${dog01.breed}");

}


