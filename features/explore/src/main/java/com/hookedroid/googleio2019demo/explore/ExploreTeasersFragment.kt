package com.hookedroid.googleio2019demo.explore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hookedroid.googleio2019demo.explore.databinding.FragmentExploreTeasersBinding

class ExploreTeasersFragment : Fragment() {

    private lateinit var mBinding: FragmentExploreTeasersBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        FragmentExploreTeasersBinding.inflate(inflater, container, false).apply {
            mBinding = this
            return root
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mBinding.storyBtn.setOnClickListener {
            val storyUri = "story://details/1".toUri()
            findNavController().navigate(storyUri)
        }
    }
}