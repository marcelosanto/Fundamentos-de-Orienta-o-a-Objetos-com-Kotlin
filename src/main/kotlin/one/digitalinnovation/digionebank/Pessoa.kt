package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Marcelo"
    var cpf: String = "112.258.669-98"
}

fun main() {
    val pessoa = Pessoa()

    println(pessoa.nome)
    println(pessoa.cpf)
}