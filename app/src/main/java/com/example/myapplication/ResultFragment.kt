package com.example.MyApplication

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class ResultFragment : Fragment(R.layout.fragment_result) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val salary = arguments?.getDouble("salary") ?: 0.0
        val rent = arguments?.getDouble("rent") ?: 0.0
        val food = arguments?.getDouble("food") ?: 0.0

        val manager = FinanceManager(FinanceModel(salary, rent, food))

        val tvResult = view.findViewById<TextView>(R.id.tk_tv_result)
        val tvIdentity = view.findViewById<TextView>(R.id.tk_tv_identity)

        val savings = manager.calculateSavings()
        tvResult.text = "Savings (15%): ${String.format("%.2f", savings)} ₾"


        if (manager.isDeficit()) {
            tvResult.setTextColor(Color.RED)
        } else {
            tvResult.setTextColor(Color.parseColor("#2E7D32"))
        }



    }
}