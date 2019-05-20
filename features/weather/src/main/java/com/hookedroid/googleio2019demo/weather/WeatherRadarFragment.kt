package com.hookedroid.googleio2019demo.weather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hookedroid.googleio2019demo.weather.databinding.FragmentWeatherRadarBinding

class WeatherRadarFragment : Fragment() {

    private lateinit var mBinding: FragmentWeatherRadarBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        FragmentWeatherRadarBinding.inflate(inflater, container, false).apply {
            mBinding = this
            return root
        }
    }
}