package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Mauro Paulino"
    var cpf: String = "123.456.789-11"

    private set // deixa apenas o SET como private, nao permitindo a sua mudança mas permitindo o ainda o GET acessivel.

    /*
    // exemplificando o conceito de inner class, outer class seria a classe Pessoa
    inner class Endereco {
        var end: String = "Rua teste numero 24"
    }
    */

}
