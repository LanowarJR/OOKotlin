package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val nayla = Funcionario(nome = "Nayla Priscila", cpf = "321.654.987.99", salario = BigDecimal.valueOf(2580.78))
    println("Nome - ${nayla.nome}")
    println("CPF - ${nayla.cpf  }")
    println("Salario - ${nayla.salario}")

}