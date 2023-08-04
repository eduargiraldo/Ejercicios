package com.Eduargiraldo.ejercicios.ejercicios.concicionales

class `ejercicio 3` {
}
fun main(){
    println(" ingrese su edad")
    var edad= readLine()!!.toInt()
    if (edad>=18) {
        println(" bienvendio si puede entrar")
    }else if (edad>0 && edad<18) {
        print(" no puede entrar chao a dormir ")
    }else if (edad<0)
        print("dato invalido")
    }
