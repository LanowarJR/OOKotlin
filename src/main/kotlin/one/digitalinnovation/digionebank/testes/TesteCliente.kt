package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val lilice = Cliente(
        nome = "Lilice Linda",
        cpf = "987.654.321.77",
        clienteTipo = ClienteTipo.PF,
        senha = "12345"
    )

    println(lilice)

    TesteAutenticacao().autentica(lilice)

}