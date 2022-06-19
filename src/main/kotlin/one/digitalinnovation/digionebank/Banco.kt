package one.digitalinnovation.digionebank

data class Banco(
    val nome: String,
    val numero: Int

){
    fun infoBank() = "Banco: $nome - Agencia: $numero"
}
