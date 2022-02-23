package com.matheus.mota.calculatorapp.model

import android.content.Context
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class Calculator(): AppCompatActivity() {

    var firstNumber: Float = 0.0f
    var secondNumber: Float = 0.0f
    private var result: Float = 0.0f
    private var clearAll: String = ""


    fun addOperator(i: Int) {
        when (i) {
            1 -> result = firstNumber + secondNumber
            2 -> result = firstNumber
            3 -> result = secondNumber
        }
    }

    fun minusOperator(i: Int) {
        when (i) {
            1 -> result = firstNumber - secondNumber
            2 -> result = firstNumber
            3 -> result = secondNumber
        }
    }

    fun multiplyOperator(i: Int) {
        when (i) {
            1 -> result = firstNumber * secondNumber
            2 -> result = firstNumber
            3 -> result = secondNumber
        }
    }

    fun divideOperator(i: Int) {
        when (i) {
            1 -> result = firstNumber / secondNumber
            2 -> result = firstNumber
            3 -> result = secondNumber
        }
    }

    fun showResult(): String {
        return result.toString()
    }

    fun clearAll(): String {
        return clearAll
    }
    }












