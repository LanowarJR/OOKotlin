package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

fun main() {
    val mauro = Pessoa(nome = "Mauro Paulino", cpf = "123.456.789.28")

    println(mauro.nome)
    println(mauro.cpf)
}