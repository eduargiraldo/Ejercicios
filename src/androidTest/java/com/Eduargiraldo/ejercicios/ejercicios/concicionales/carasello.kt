package com.Eduargiraldo.ejercicios.ejercicios.concicionales

class carasello {
}
fun main() {
    println("¿Cuántas veces quieres jugar?")
    var vida = readLine()!!.toInt()

    for (i in 1..vida) {
        println("Ingresa cara o sello")
        var opci = readLine()!!.toString()

        val random = (1..2).random()
        val resultado = if (random == 1) "cara" else "sello"

        println("La máquina eligió $resultado")

        if (opci == resultado) {
            println("¡Ganaste!")
        } else {
            println("¡Perdiste!")
        }
    }
}