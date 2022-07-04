package com.derrick.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //declaring an id for the button
        val rollButton = findViewById<Button>(R.id.button)
        //setting an on click listener for the button to perform required function
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        //creating new dice object with six sides and rolling it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        //Finding the imageview in the layout
        val diceimage = findViewById<ImageView>(R.id.imageview)
        //determining the drawable resource id to use based on the dice roll, use when else statement
        val drawableResource = when(diceRoll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //Updating image view with the correct drawable resource id
        diceimage.setImageResource(drawableResource)
        //update the content description
        diceimage.contentDescription = diceRoll.toString()
    }
}