package com.example.e9m5

fun main() {

    println("Ingrese el valor a convertir")

    val input = readLine()!!.toDouble()

    val fahrenheit = ((9.0 / 5.0) *input) + 32

    println("El valor resultante de la conversión a Fahrenheit es $fahrenheit")

    val kelvin = input * 273.15

    println("El valor resultante de la conversión a Kelvin es $kelvin")

    val fahrenheitKelvin = 5.0/9.0 * (fahrenheit - 32) + 273.15

    println("El valor resultante de la conversión de Fahrenheit a Kelvin es $fahrenheitKelvin")


}

fun isLetter (string: String): Boolean{
    return string.none { it !in 'A' .. 'Z' && it !in 'a' .. 'z'}
}
