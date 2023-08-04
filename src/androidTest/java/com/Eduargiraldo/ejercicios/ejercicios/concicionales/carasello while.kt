package com.Eduargiraldo.ejercicios.ejercicios.concicionales

class `carasello while` {
}
fun main() {
    println("¿Cuántas veces quieres jugar?")
    var vida = readLine()!!.toInt()
    var res = 1
    while (res == 1 && vida > 0) {
        println("Ingresa cara o sello")
        var opci = readLine()!!.toString()

        val random = (1..2).random()
        val resultado = if (random == 1) "cara" else "sello"

        println("La máquina eligió $resultado")

        if (opci == resultado) {
            println("¡Ganaste!")
        } else {
            println("¡Perdiste!")
            vida--
        }
        if (vida == 0) {
            println("¡Te quedaste sin vidas!")
            break
        }
        println("¿Quieres seguir jugando? Ingresa 1 para sí, 0 para no")
        res = readLine()!!.toInt()
    }
}