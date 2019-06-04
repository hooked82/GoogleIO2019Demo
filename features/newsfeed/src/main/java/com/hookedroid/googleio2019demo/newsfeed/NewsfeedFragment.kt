package com.hookedroid.googleio2019demo.newsfeed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hookedroid.googleio2019demo.newsfeed.databinding.FragmentNewsfeedBinding

class NewsfeedFragment : Fragment() {

    private lateinit var mBinding: FragmentNewsfeedBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        FragmentNewsfeedBinding.inflate(inflater, container, false).apply {
            mBinding = this
            return root
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val storyId = "1"
        mBinding.newsfeedStoryBtn.setOnClickListener {
            val storyUri = "story://details/$storyId".toUri()
            findNavController().navigate(storyUri)
        }
    }
}