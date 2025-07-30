fun main() {

//    val gerente = Gerente(
//        nome = "Alice",
//        idade = 35,
//        salario = 8000.0,
//        subordinados = emptyList()
//    );
//
//    var vendedor = Vendedor(
//        nome = "Bob",
//        idade = 28,
//        salario = 3000.0,
//        gerente = gerente
//    );
//
//    gerente.baterPonto();
//    gerente.trabalhar();
//    gerente.contratar(vendedor);
//    gerente.promover( vendedor);
//    gerente.demitir(vendedor);
//
//    vendedor.baterPonto();
//    vendedor.trabalhar();
//    vendedor.vender();
//    vendedor.mostrarVendas();

//    var bird = Bird(
//        nome = "Tweety",
//        especie = "Canário"
//    );
//
//    bird.emitirSom();
//
//    var gato = Gato(
//        nome = "Mittens",
//        raca = "Siamês"
//    );
//
//    gato.emitirSom();

//    var presente01 = Presente<Camiseta>(
//        nome = "Camiseta de Algodão",
//        descricao = "Camiseta confortável de algodão orgânico.",
//        valor = 49.99,
//    )
//
//    println(presente01.toString());

    print("Digite o primeiro número: ")
    val primeiroNumero = readLine()?.toDoubleOrNull() ?: run {
        println("Entrada inválida. Por favor, insira um número válido.")
        return
    }

    print("Digite o segundo número: ")
    val segundoNumero = readLine()?.toDoubleOrNull() ?: run {
        println("Entrada inválida. Por favor, insira um número válido.")
        return
    }

    val resultado = primeiroNumero + segundoNumero;
    println("A soma de $primeiroNumero + $segundoNumero = $resultado");

}


