class Camiseta(var nome: String, var descricao: String, var valor: Double) {

    override fun toString(): String {
        return "Camiseta(nome='$nome', descricao='$descricao', valor=$valor)"
    }
}