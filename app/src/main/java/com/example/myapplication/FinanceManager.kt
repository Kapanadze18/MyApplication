package com.example.MyApplication

class FinanceManager(private val data: FinanceModel) {
    // თენგო კაპანაძე (8 ასო) + ივლისი (7) = 15%
    val savingsPercent = 15.0

    fun calculateTotalExpenses(): Double = data.rent + data.food

    fun calculateSavings(): Double {
        val remaining = data.salary - calculateTotalExpenses()
        return if (remaining > 0) remaining * (savingsPercent / 100.0) else 0.0
    }

    fun isDeficit(): Boolean = calculateTotalExpenses() > data.salary
}