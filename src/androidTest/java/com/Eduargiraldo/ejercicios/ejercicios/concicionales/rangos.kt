package com.Eduargiraldo.ejercicios.ejercicios.concicionales

class rangos {
}

fun main() {
    println("Ingrese el primer número")
    var n1= readLine()!!.toDouble()
    println("Ingrese el segundo número")
    var n2= readLine()!!.toDouble()
    println("ingrese la operaciòn que desea resolver suma, resta, multiplicaciòn, divisiòn y raiz")
    var oper= readLine()!!.toString()

    var suma=n1+n2
    when (oper) {
        "suma" -> println("Usted eligio sumar\n El resultado de sumar $n1+$n2 es $suma")
        "resta"->println("Usted eligio sumar\n El resultado de restar $n1-$n2 es ${(n1-n2)}")
        "multiplicacion"-> {
            var multi=n1*n2
            println("Usted eligio sumar\n El resultado de multiplicar $n1*$n2 es $multi")
        }
        "division"-> {
            var divi=n1/n2
            println("Usted eligio sumar\n El resultado de dividir $n1/$n2 es $divi")
        }
        "raiz"-> {
            var raiz=Math.sqrt(n2)
            println("Usted eligio sumar\n El resultado de la raiz cuadrada es √ $n2 es $raiz")
        }
        "raiz"-> {
            var pot=Math.pow(n1,n2)
            println("Usted eligio sumar\n El resultado de la raiz cuadrada es $n1 e $n2 es $pot")
        }
    }





}