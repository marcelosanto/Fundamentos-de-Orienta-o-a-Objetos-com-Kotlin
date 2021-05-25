package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco("DigiOne", 456)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    //copy() -> altera somente o que precisa
    val banco2 = digiOneBank.copy(nome = "DigitalOne")
    println(banco2.info())
}