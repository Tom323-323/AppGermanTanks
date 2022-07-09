package com.tomaslab.appgermantanks.presenter.screens

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tomaslab.appgermantanks.R
import com.tomaslab.appgermantanks.databinding.FragmentSplashBinding

class SplashFragment : Fragment(R.layout.fragment_splash) {

    private var binding: FragmentSplashBinding?=null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSplashBinding.bind(view)

        showFragment()

    }

    private fun showFragment(){
        Handler().postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_rootFragment)
        }, 1000)



    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}