abstract class Animal(
    val nome: String
) {

    abstract fun emitirSom();

}


class Bird(
    nome: String,
    val especie: String
) : Animal(nome) {

    override fun emitirSom() {
        println("$nome, a $especie, está cantando.")
    }
}

class Gato(
    nome: String,
    val raca: String
) : Animal(nome) {

    override fun emitirSom() {
        println("$nome, o gato da raça $raca, está miando.")
    }
}