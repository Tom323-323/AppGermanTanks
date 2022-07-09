package com.tomaslab.appgermantanks.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tomaslab.appgermantanks.R
import com.tomaslab.appgermantanks.databinding.FragmentSplashBinding

class SplashFragment : Fragment(R.layout.fragment_splash) {

    private var binding: FragmentSplashBinding?=null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSplashBinding.bind(view)
    }



    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}