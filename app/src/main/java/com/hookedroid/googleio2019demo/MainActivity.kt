package com.hookedroid.googleio2019demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.hookedroid.googleio2019demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding.toolbar.setupWithNavController(findNavController(R.id.nav_host_fragment))
        mBinding.bottomNav.setupWithNavController(findNavController(R.id.nav_host_fragment))
    }
}