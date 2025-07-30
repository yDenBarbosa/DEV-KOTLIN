class Client(
    var name: String,
    var idade: Int,
    private var saldo: Double) {

    fun showInfo() {
        println("Client Name: $name, Age: $idade, Balance: $saldo")
    }

    fun deposit(amount: Double) {
        if (amount > 0) {
            saldo += amount
            println("Deposited: $amount, New Balance: $saldo")
        } else {
            println("Deposit amount must be positive.")
        }
    }

    // public
    // private
    // protected
    // internal


}