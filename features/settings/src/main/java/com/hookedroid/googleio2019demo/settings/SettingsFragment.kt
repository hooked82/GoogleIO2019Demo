package com.hookedroid.googleio2019demo.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hookedroid.googleio2019demo.settings.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {

    private lateinit var mBinding: FragmentSettingsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        FragmentSettingsBinding.inflate(inflater, container, false).apply {
            mBinding = this
            return root
        }
    }
}