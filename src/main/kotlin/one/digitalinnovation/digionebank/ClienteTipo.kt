package one.digitalinnovation.digionebank

enum class ClienteTipo(val descricao: String) { // construtor primario da ENUM com sua propiedade

    // Objetos internos da ENUM, instancias da propria classe, ja declaradas como singleton
    //sao instancias unicas, sem modificação

    PF("Pessoa Fisica"),
    PJ("Pessoa Juridica");

}