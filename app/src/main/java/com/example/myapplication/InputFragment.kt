package com.example.MyApplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class InputFragment : Fragment(R.layout.fragment_input) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn = view.findViewById<Button>(R.id.tk_btn_calculate)
        val etSalary = view.findViewById<EditText>(R.id.tk_edit_salary)
        val etRent = view.findViewById<EditText>(R.id.tk_edit_rent)
        val etFood = view.findViewById<EditText>(R.id.tk_edit_food)

        btn.setOnClickListener {
            val s = etSalary.text.toString().toDoubleOrNull() ?: 0.0
            val r = etRent.text.toString().toDoubleOrNull() ?: 0.0
            val f = etFood.text.toString().toDoubleOrNull() ?: 0.0

            val bundle = Bundle().apply {
                putDouble("salary", s)
                putDouble("rent", r)
                putDouble("food", f)
            }

            val resultFrag = ResultFragment().apply { arguments = bundle }

            parentFragmentManager.beginTransaction()
                .replace(R.id.tk_fragment_container, resultFrag)
                .addToBackStack(null)
                .commit()
        }
    }
}