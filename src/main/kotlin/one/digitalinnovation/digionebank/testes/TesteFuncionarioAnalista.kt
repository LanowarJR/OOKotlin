package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val nayla = Analista(nome = "Nayla Priscila", cpf = "321.654.987.99", salario = 2580.78)
    /*println("Nome - ${nayla.nome}")
    println("CPF - ${nayla.cpf  }")
    println("Salario - ${nayla.salario}")*/

    imprimeRelatorio(nayla)
}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())