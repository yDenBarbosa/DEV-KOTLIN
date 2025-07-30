
open class Pessoa(val nome: String, val dataDeNascimento: Int, val cpf: String, val endereco: String) {

    open fun exibirDetalhes() {
        println("Nome: $nome")
        println("Data de Nascimento: $dataDeNascimento")
        println("CPF: $cpf")
        println("Endereço: $endereco")
    }
}

class Aluno(
        nome: String,
        dataDeNascimento: Int,
        cpf: String,
        endereco: String,
        val matricula: String) : Pessoa(nome, dataDeNascimento, cpf, endereco) {

    fun exibirDetalhesAluno() {
        exibirDetalhes()
        println("Matrícula: $matricula")
    }

    override fun exibirDetalhes() {
        println("Detalhes do Aluno:")
        println("Matrícula: $matricula")
    }
}