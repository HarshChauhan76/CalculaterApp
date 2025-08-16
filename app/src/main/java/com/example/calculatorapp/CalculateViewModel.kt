package com.example.calculatorapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculateViewModel : ViewModel() {
     var displayText by mutableStateOf("0")

    private var operand1 = ""

    private var operand2 = ""

    private var operator = ""

  fun onNumberClicked(number : String){
      if (operator.isEmpty()){
          operand1+=number
          displayText = operand1
      }
      else{
          operand2+=number
          displayText = operand2
      }

  }
    fun onOperatorClick(op : String){
        if (operand1.isNotEmpty()){
            operator = op
        }
    }
    fun onEqualClick(){
        if (operand1.isNotEmpty() && operand2.isNotEmpty()){
            val result = when(operator){
                "+" -> operand1.toDouble() + operand2.toDouble()
                "-" -> operand1.toDouble() - operand2.toDouble()
                "*" -> operand1.toDouble() * operand2.toDouble()
                "/" -> operand1.toDouble() / operand2.toDouble()
                "%" -> operand1.toDouble() % operand2.toDouble()

                else -> 0
            }
            displayText = result.toString()
            operand1 = result.toString()
            operand2 = ""
            operator = ""

        }

    }
    fun onClear(){
        operand1 = ""
        operand2 = ""
        operator = ""
        displayText = "0"
    }

}