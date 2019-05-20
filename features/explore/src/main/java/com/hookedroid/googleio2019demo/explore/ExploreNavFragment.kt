package com.hookedroid.googleio2019demo.explore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.hookedroid.googleio2019demo.explore.databinding.FragmentExploreNavBinding

class ExploreNavFragment : Fragment() {

    private lateinit var mBinding: FragmentExploreNavBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        FragmentExploreNavBinding.inflate(inflater, container, false).apply {
            mBinding = this
            return root
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mBinding.exploreTeasersBtn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_exploreNavFragment_to_exploreTeasersFragment, null)
        )
    }
}