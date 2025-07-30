
interface Vendedor {
    fun vender()
}
interface Comprador {
    fun comprar()
}
interface Motorista {
    fun dirigir()
}
interface Entregador {
    fun entregar()
}

interface  Musico {
    fun tocar()
}

class Joao: Vendedor, Comprador, Motorista, Entregador, Musico {

    override fun vender() {
        println("João está vendendo.")
    }

    override fun comprar() {
        println("João está comprando.")
    }

    override fun dirigir() {
        println("João está dirigindo.")
    }

    override fun entregar() {
        println("João está entregando.")
    }

    override fun tocar() {
        println("João está tocando música.")
    }

}

