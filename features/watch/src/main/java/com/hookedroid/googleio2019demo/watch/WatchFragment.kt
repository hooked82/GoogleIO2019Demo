package com.hookedroid.googleio2019demo.watch

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hookedroid.googleio2019demo.watch.databinding.FragmentWatchBinding

class WatchFragment : Fragment() {

    private lateinit var mBinding: FragmentWatchBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        FragmentWatchBinding.inflate(inflater, container, false).apply {
            mBinding = this
            return root
        }
    }
}