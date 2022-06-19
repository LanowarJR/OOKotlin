package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {

    // usanfo forEach para lista os parametros do ENUM ClienteTipo, nomeando a interaçao como ex. elemento
    ClienteTipo.values().forEach {elemento ->
        println("${elemento.name } - ${elemento.descricao}")
    }

    /*
    // usanfo forEach para lista os parametros do ENUM ClienteTipo, deixando a interaçao como o defatul = it

    ClienteTipo.values().forEach {
        println("${it.name } - ${it.descricao}")
    }
    */


    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("${pj.name} - ${pj.descricao}")

}