package com.example.calculator

sealed interface CalculatorAction {
    data class Number(val number: Int) : CalculatorAction
    object Clear: CalculatorAction
    object Delete: CalculatorAction
    object Decimal: CalculatorAction
    object Calculate: CalculatorAction
    data class  Operation(val operation: String) : CalculatorAction
}