package one.digitalinnovation.digionebank

abstract class Pessoa ( // open permite que outra classe possa herdar as propiedades desta classe, como funcionario

    val nome: String ,
    val cpf: String
    ){

    //private set // deixa apenas o SET como private, nao permitindo a sua mudança mas permitindo o ainda o GET acessivel.

    /*
    // exemplificando o conceito de inner class, outer class seria a classe Pessoa
    inner class Endereco {
        var end: String = "Rua teste numero 24"
    }
    */

}
