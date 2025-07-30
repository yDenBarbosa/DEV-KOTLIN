fun main() {

//    var dog01 = Dog("Rex", 5, "Labrador");
//    var dog02 = Dog("Bella", 3, "Beagle");

    // println("Dog Name: ${dog01.name}, Age: ${dog01.age}, Breed: ${dog01.breed}");

    //print(dog01.toString());

    //print(dog01.equals(dog02))

//    dog02 = dog01.copy();
//
//
//    println("Dog Name: ${dog01.name}, Age: ${dog01.age}, Breed: ${dog01.breed}");
//
//    println("Dog Name: ${dog02.name}, Age: ${dog02.age}, Breed: ${dog02.breed}");

//    fun updateDog(dog: Dog, newAge: Int): Dog {
//        return dog.copy(age = newAge)
//    }
//
//    var updateDogCaramelo = updateDog(dog01, 10);
//
//    println("Dog Name: ${updateDogCaramelo.name}, Age: ${updateDogCaramelo.age}, Breed: ${updateDogCaramelo.breed}");

//
//    val (name, _, breed) = dog01;
//
//
//    println("Dog Name: $name, Breed: $breed");


//    val domesticCat = Cat.Domestic("Whiskers", 2);
//    val wildCat = Cat.Wild("Lion", "Savannah");
//
//    when (domesticCat) {
//        is Cat.Domestic -> println("Domestic Cat: ${domesticCat.name}, Age: ${domesticCat.age}")
//    }
//
//    when (wildCat) {
//        is Cat.Wild -> println("Wild Cat: ${wildCat.species}, Habitat: ${wildCat.habitat}")
//    }

// val status = StatusPedido.PENDENTE
//
//    println("Status: ${status.descricao}")
//    println("Is Finalizado: ${status.isFinalizado()}")
//
//    val statusConcluido = StatusPedido.CONCLUIDO
//    println("Status: ${statusConcluido.descricao}")
//    println("Is Finalizado: ${statusConcluido.isFinalizado()}")


    // Os Pilares da POO
    // 1. Abstração
    // 2. Encapsulamento
    // 3. Herança
    // 4. Polimorfismo


//    var client = Client("John Doe", 30, 1000.0);
//
//    client.showInfo();
//
//    client.name = "Jane Doe";
//
//    client.showInfo();
//
//    client.deposit(-1500.0);
//
//    client.showInfo();

//
//    print("Digite o primeiro numero a ser somado: ");
//    val primeiroNumero = readLine()!!.toInt();
//    print("Digite o segundo numero a ser somado: ");
//    val segundoNumero = readLine()!!.toInt();
//    val resultado = primeiroNumero + segundoNumero;
//    println("A soma de $primeiroNumero + $segundoNumero = $resultado");

    var pessoa = Pessoa("João", 1990, "123.456.789-00", "Rua A, 123");
    //pessoa.exibirDetalhes();

    var aluno = Aluno("Maria", 2000, "987.654.321-00", "Rua B, 456", "2023001");
    //aluno.exibirDetalhesAluno();
    aluno.exibirDetalhes();
}


