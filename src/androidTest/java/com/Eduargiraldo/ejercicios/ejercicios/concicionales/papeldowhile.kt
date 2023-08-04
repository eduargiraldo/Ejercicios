package com.Eduargiraldo.ejercicios.ejercicios.concicionales

class papeldowhile {
}
fun main() {
    println("¿Cuántas veces quieres jugar?")
    val vida = readLine()!!.toInt()

    var i = 1
    do {
        println("Elige piedra, papel o tijera: ")
        val elige = readLine()!!.toString()

        val computer = listOf("piedra", "papel", "tijera").random()
        println("La computadora eligió $computer")

        if (elige == computer) {
            println("Empate")
        } else if (elige == "piedra" && computer == "tijera") {
            println("Ganaste")
        } else if (elige == "papel" && computer == "piedra") {
            println("Ganaste")
        } else if (elige == "tijera" && computer == "papel") {
            println("Ganaste")
        } else {
            println("La computadora gana!")
        }

        i++
    } while (i <= vida)
}