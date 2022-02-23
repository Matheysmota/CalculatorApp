package com.matheus.mota.calculatorapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.matheus.mota.calculatorapp.databinding.ActivityCalculatorBinding
import com.matheus.mota.calculatorapp.model.Calculator


open class CalculatorActivity : AppCompatActivity() {

    lateinit var binding: ActivityCalculatorBinding

    var firstNumber = ""
    var secondNumber = ""
    var calculator = Calculator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        supportActionBar?.hide()

    }
    override fun onResume() {
        super.onResume()
        allClicked()
        }

    protected fun allClicked(){
        binding.sumButton.setOnClickListener{
            firstNumber = binding.firstEditText.text.toString()
            secondNumber = binding.secondEditText.text.toString()
            sum()
        }
       binding.minusButton.setOnClickListener{
        firstNumber = binding.firstEditText.text.toString()
            secondNumber = binding.secondEditText.text.toString()
            subtract()
        }
        binding.multiplyButton.setOnClickListener{
            firstNumber = binding.firstEditText.text.toString()
            secondNumber = binding.secondEditText.text.toString()
            multiply()
        }
        binding.divideButton.setOnClickListener{
            firstNumber = binding.firstEditText.text.toString()
            secondNumber = binding.secondEditText.text.toString()
            divide()
        }
        binding.clearButton.setOnClickListener{
            binding.resultTextView.text = calculator.clearAll()
            binding.firstEditText.text.clear()
            binding.secondEditText.text.clear()
        }
    }
    protected fun sum() {
        when {
            binding.firstEditText.text.isNotEmpty() && binding.secondEditText.text.isNotEmpty() -> {
                calculator.firstNumber = firstNumber.toFloat()
                calculator.secondNumber = secondNumber.toFloat()
                calculator.addOperator(i = 1)
                binding.resultTextView.text = calculator.showResult()
            }
            binding.firstEditText.text.isNotEmpty() && binding.secondEditText.text.isEmpty() -> {
                calculator.firstNumber = firstNumber.toFloat()
                calculator.addOperator(i = 2)
                binding.resultTextView.text = calculator.showResult()
            }
            binding.firstEditText.text.isEmpty() && binding.secondEditText.text.isNotEmpty() -> {
                calculator.secondNumber = secondNumber.toFloat()
                calculator.addOperator(i = 3)
                binding.resultTextView.text = calculator.showResult()
            }
            else -> {
                binding.resultTextView.text = ""
                Toast.makeText(this, "Digite algum número, por favor.", Toast.LENGTH_SHORT).show()

            }

        }
    }
    protected fun divide() {
        when {
            binding.firstEditText.text.isNotEmpty() && binding.secondEditText.text.isNotEmpty() -> {
                calculator.firstNumber = firstNumber.toFloat()
                calculator.secondNumber = secondNumber.toFloat()
                calculator.divideOperator(1)
                binding.resultTextView.text = calculator.showResult()
            }
            binding.firstEditText.text.isNotEmpty() && binding.secondEditText.text.isEmpty() -> {
                calculator.firstNumber = firstNumber.toFloat()
                calculator.divideOperator(2)
                binding.resultTextView.text = calculator.showResult()
            }
            binding.firstEditText.text.isEmpty() && binding.secondEditText.text.isNotEmpty() -> {
                calculator.secondNumber = secondNumber.toFloat()
                calculator.divideOperator(3)
                binding.resultTextView.text = calculator.showResult()
            }
            else -> {
                binding.resultTextView.text = ""
                Toast.makeText(this, "Digite algum número, por favor.", Toast.LENGTH_SHORT).show()

            }

        }
    }
    protected fun multiply() {
        when {
            binding.firstEditText.text.isNotEmpty() && binding.secondEditText.text.isNotEmpty() -> {
                calculator.firstNumber = firstNumber.toFloat()
                calculator.secondNumber = secondNumber.toFloat()
                calculator.multiplyOperator(1)
                binding.resultTextView.text = calculator.showResult()
            }
            binding.firstEditText.text.isNotEmpty() && binding.secondEditText.text.isEmpty() -> {
                calculator.firstNumber = firstNumber.toFloat()
                calculator.multiplyOperator(2)
                binding.resultTextView.text = calculator.showResult()
            }
            binding.firstEditText.text.isEmpty() && binding.secondEditText.text.isNotEmpty() -> {
                calculator.secondNumber = secondNumber.toFloat()
                calculator.multiplyOperator(3)
                binding.resultTextView.text = calculator.showResult()
            }
            else -> {
                binding.resultTextView.text = ""
                Toast.makeText(this, "Digite algum número, por favor.", Toast.LENGTH_SHORT).show()

            }

        }
    }
    protected fun subtract() {
        when {
            binding.firstEditText.text.isNotEmpty() && binding.secondEditText.text.isNotEmpty() -> {
                calculator.firstNumber = firstNumber.toFloat()
                calculator.secondNumber = secondNumber.toFloat()
                calculator.minusOperator(1)
                binding.resultTextView.text = calculator.showResult()
            }
            binding.firstEditText.text.isNotEmpty() && binding.secondEditText.text.isEmpty() -> {
                calculator.firstNumber = firstNumber.toFloat()
                calculator.minusOperator(2)
                binding.resultTextView.text = calculator.showResult()
            }
            binding.firstEditText.text.isEmpty() && binding.secondEditText.text.isNotEmpty() -> {
                calculator.secondNumber = secondNumber.toFloat()
                calculator.minusOperator(3)
                binding.resultTextView.text = calculator.showResult()
            }
            else -> {
                binding.resultTextView.text = ""
                Toast.makeText(this, "Digite algum número, por favor.", Toast.LENGTH_SHORT).show()

            }

        }
    }
}
