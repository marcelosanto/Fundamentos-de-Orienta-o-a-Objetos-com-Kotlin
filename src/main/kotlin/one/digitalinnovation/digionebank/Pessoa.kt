package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Marcelo"
    var cpf: String = "112.258.669-98"

    private  set

    constructor()

    fun uneNomeCpf() = "${nome} e ${cpf}"
}

fun main() {
    val pessoa = Pessoa()

    println(pessoa)
    println(pessoa.nome)
    println(pessoa.cpf)
    println(pessoa.uneNomeCpf())
}