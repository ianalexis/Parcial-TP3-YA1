package com.example.parcial_tp3_ya1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.adapters.OffersAdapter

import com.example.parcial_tp3_ya1.providers.OffersProvider
import com.google.android.material.textfield.TextInputLayout

class SearchFragment : Fragment() {

    lateinit var view1 : View
    lateinit var offersRv: RecyclerView
    lateinit var searchButton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        arguments?.let {

        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         this.view1 = inflater.inflate(R.layout.fragment_search, container, false)
         this.offersRv = view1.findViewById(R.id.fragment_search_rv)
         this.searchButton = view1.findViewById(R.id.fragment_search_btnSearch)

        searchButton.setOnClickListener {
            val action = SearchFragmentDirections.actionSearchToFlightFragment()
            findNavController().navigate(action)
        }

        var selectList : AutoCompleteTextView
        // Obtener referencia al AutoCompleteTextView del layout
        selectList = view1.findViewById(R.id.dropdown)

        // Lista de elementos predeterminada
        val items = arrayOf("Elemento 1", "Elemento 2", "Elemento 3", "Elemento 4")

        // Crear un adaptador con la lista de elementos
        val adapter = ArrayAdapter(requireActivity(), android.R.layout.simple_dropdown_item_1line, items)

        // Establecer el adaptador en el AutoCompleteTextView
        selectList.setAdapter(adapter)

        return view1
    }

    override fun onStart(){
        super.onStart()

        //offers
        offersRv.setHasFixedSize(true)

        val linearLayoutManager3 = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        offersRv.layoutManager = linearLayoutManager3

        val offersAdapter = OffersAdapter(OffersProvider.offersEntitieLists)
        offersRv.adapter = offersAdapter

    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SearchFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}