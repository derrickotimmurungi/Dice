package com.derrick.dice

class Dice(private val numSides: Int) {
//Do a random dice roll and return the result
    fun roll():Int{
    return (1..numSides).random()
    }
}
