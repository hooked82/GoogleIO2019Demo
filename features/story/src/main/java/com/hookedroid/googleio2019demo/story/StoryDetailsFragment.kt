package com.hookedroid.googleio2019demo.story

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hookedroid.googleio2019demo.story.databinding.FragmentStoryDetailsBinding

class StoryDetailsFragment : Fragment() {

    private lateinit var mBinding: FragmentStoryDetailsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        FragmentStoryDetailsBinding.inflate(inflater, container, false).apply {
            mBinding = this
            return root
        }
    }
}