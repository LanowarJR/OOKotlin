package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val  digiOneBank = Banco(nome = "DigiOne", numero = 33) // parametros usando o conceito de argumento nomeavel

    println(digiOneBank.infoBank())




    /*
    // realiza uma copia da DATA CLASS BANCO, que é imutavel seus parametros, sendo assim possivel modifica-lo.
    val banco2 = digiOneBank.copy(nome = "BancoTesteCopy", numero = 34)
    println(banco2.nome)
    println(banco2.numero)
    */

}
