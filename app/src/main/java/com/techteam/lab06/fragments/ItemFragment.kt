package com.techteam.lab06.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.techteam.lab06.R

class ItemFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_item, container, false)

        val btnExpand: ImageButton = view.findViewById(R.id.btn_expand)

        btnExpand.setOnClickListener {
            // Cambia a CroquisFragment
            val fragment = CroquisFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.main_container, fragment) // Usa el ID del FragmentContainerView
            transaction.addToBackStack(null) // Agrega a la pila de retroceso
            transaction.commit()
        }

        return view
    }
}
