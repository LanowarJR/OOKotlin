package one.digitalinnovation.digionebank

open class Pessoa ( // open permite que outra classe possa herdar as propiedades desta classe, como funcionario

    open val nome: String ,
    open val cpf: String
    ){

    //private set // deixa apenas o SET como private, nao permitindo a sua mudança mas permitindo o ainda o GET acessivel.

    /*
    // exemplificando o conceito de inner class, outer class seria a classe Pessoa
    inner class Endereco {
        var end: String = "Rua teste numero 24"
    }
    */

}
