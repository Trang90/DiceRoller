package com.example.diceroller

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.diceroller.databinding.FragmentFirstBinding
import java.util.*
import kotlin.random.Random as Random1

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {
private lateinit var binding: FragmentFirstBinding
    lateinit var diceImage : ImageView

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding=FragmentFirstBinding.bind(view)
        binding.rollButton.setOnClickListener {
            rollDice()
        }
        diceImage=binding.diceFirst

       //view.findViewById<Button>(R.id.roll_button).setOnClickListener {
           //Toast.makeText(activity, "button clicked", Toast.LENGTH_SHORT).show()
          // rollDice()
       //}


        //view.findViewById<Button>(R.id.roll_button).setOnClickListener {
         //  findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)

       // }
    }

    private fun rollDice() {

        val randomInt = Random().nextInt(6)+1
        val drawableResource = when (randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

        //val resultText = view?.findViewById<TextView>(R.id.textview_first)
        //resultText?.text ="Dice Roll"


    }
}