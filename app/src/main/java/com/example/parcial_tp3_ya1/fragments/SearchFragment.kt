package com.example.parcial_tp3_ya1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.adapters.OffersAdapter
import com.example.parcial_tp3_ya1.providers.OffersProvider
import com.google.android.material.button.MaterialButtonToggleGroup
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.textfield.TextInputEditText
import java.text.SimpleDateFormat
import java.util.Locale

class SearchFragment : Fragment() {

    lateinit var view1 : View
    lateinit var offersRv: RecyclerView
    lateinit var searchButton : Button
    lateinit var categoryList : AutoCompleteTextView
    lateinit var toggleButton: MaterialButtonToggleGroup
    lateinit var fromInput: TextInputEditText
    lateinit var toInput: TextInputEditText
    lateinit var dateInput: EditText
    lateinit var passengersInput: TextInputEditText

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
        this.categoryList = view1.findViewById(R.id.classInput)
        this.toggleButton = view1.findViewById(R.id.toggleButton)
        this.fromInput = view1.findViewById(R.id.fromInput)
        this.toInput = view1.findViewById(R.id.toInput)
        this.dateInput = view1.findViewById(R.id.dateInput)
        this.passengersInput = view1.findViewById(R.id.passengersInput)

        searchButton.setOnClickListener {
            val action = SearchFragmentDirections.actionSearchToFlightFragment()
            findNavController().navigate(action)
        }

        val items = listOf("Economy", "Business")
        val adapter = ArrayAdapter(requireContext(), R.layout.item_list_search_category, items)
        categoryList.setAdapter(adapter)

        dateInput.setOnClickListener {
            val datePicker = MaterialDatePicker.Builder.datePicker()
                .setTitleText("Select date")
                .build()

            datePicker.addOnPositiveButtonClickListener { selection ->
                val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                dateInput.setText(sdf.format(selection))
            }

            datePicker.show(childFragmentManager, "DATE_PICKER")
        }

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
        fun newInstance() =
            SearchFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}