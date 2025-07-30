//open class Funcionario(
//    val nome: String,
//    var idade: Int,
//    var salario: Double
//
//) {
//    fun baterPonto() {
//        println("$nome bateu ponto.")
//    }
//
//    fun trabalhar() {
//        println("$nome está trabalhando.")
//    }
//}
//
//class Gerente(
//    nome: String,
//    idade: Int,
//    salario: Double,
//    var subordinados: List<Funcionario>
//) : Funcionario(nome = nome, idade = idade, salario = salario) {
//
//    fun contratar(funcionario: Funcionario) {
//        println("$nome contratou ${funcionario.nome}.")
//    }
//
//    fun promover(funcionario: Funcionario) {
//        println("$nome promoveu ${funcionario.nome}.")
//    }
//
//    fun demitir(funcionario: Funcionario) {
//        println("$nome demitiu ${funcionario.nome}.")
//    }
//}
//
//
////class Vendedor(
////    nome: String,
////    idade: Int,
////    salario: Double,
////    var vendas: Int = 0,
////    var gerente: Gerente? = null
////) : Funcionario(nome = nome, idade = idade, salario = salario) {
////
////    fun vender() {
////        println("$nome está vendendo.")
////        vendas++
////    }
////
////    fun mostrarVendas() {
////        println("$nome fez $vendas vendas.")
////    }
////}