package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main() {
    val alice = Gerente(nome = "Alice Lopes de Paiva", cpf = "498.654.987.99", salario = 10125.89)
    /*println("Nome - ${nayla.nome}")
    println("CPF - ${nayla.cpf  }")
    println("Salario - ${nayla.salario}")*/

    imprimeRelatorio(alice)
}

fun imprimeRelatorio(gerente: Gerente) = println(gerente.toString())