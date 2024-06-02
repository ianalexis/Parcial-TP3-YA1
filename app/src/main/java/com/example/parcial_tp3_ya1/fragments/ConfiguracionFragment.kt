package com.example.parcial_tp3_ya1.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.SwitchPreferenceCompat
import com.example.parcial_tp3_ya1.R

class ConfiguracionFragment : PreferenceFragmentCompat() {

    companion object {
        fun newInstance() = ConfiguracionFragment()
    }

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.default_preference_screen, rootKey)

        val nightMode = findPreference<SwitchPreferenceCompat>(getString(R.string.preference_night_mode_key))
        nightMode?.setDefaultValue(false)
        nightMode?.setOnPreferenceChangeListener { _: Preference?, newValue: Any? ->
            if (newValue == true) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
            true
        }
    }
}