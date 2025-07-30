enum class StatusPedido(val descricao: String) {
    PENDENTE("Pendente"),
    EM_ANDAMENTO("Em Andamento"),
    CONCLUIDO("Concluído"),
    CANCELADO("Cancelado");


    fun isFinalizado(): Boolean {
        return this == CONCLUIDO || this == CANCELADO
    }

}