package com.Eduargiraldo.ejercicios.ejercicios.concicionales

class papel {
}
fun main() {
    println("¿Cuántas veces quieres jugar?")
    val vida = readLine()!!.toInt()

    for (i in 1..vida) {
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

        }
    }
