package com.example.parcial_tp3_ya1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.parcial_tp3_ya1.R
import com.example.parcial_tp3_ya1.providers.ProfileProvider
import java.security.Provider

class ProfileFragment : Fragment() {

    lateinit var vista : View
    lateinit var name : TextView
    lateinit var city : TextView
    lateinit var desc : TextView
    lateinit var imgProfile : ImageView
    lateinit var imgBackground : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vista = inflater.inflate(R.layout.fragment_profile, container, false)
        name = vista.findViewById(R.id.fragment_profile_name)
        city = vista.findViewById(R.id.fragment_profile_txtCity)
        desc = vista.findViewById(R.id.fragment_profile_txtDesc)
        imgProfile = vista.findViewById(R.id.fragment_profile_image)
        imgBackground = vista.findViewById(R.id.fragment_profile_background_image)
        return vista
    }
    override fun onStart() {
        super.onStart()
        val profile = ProfileProvider.profileEntitie
        name.text = profile.name
        city.text = profile.city
        desc.text = profile.desc
        Glide.with(vista).load(profile.profileimage).into(imgProfile)
        Glide.with(vista).load(profile.backgroundimage).into(imgBackground)
    }
}