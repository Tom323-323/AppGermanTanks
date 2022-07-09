package com.tomaslab.appgermantanks.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tomaslab.appgermantanks.R
import com.tomaslab.appgermantanks.databinding.FragmentRootBinding
import com.tomaslab.appgermantanks.databinding.FragmentSplashBinding

class RootFragment : Fragment(R.layout.fragment_root) {

    private var binding: FragmentRootBinding?=null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRootBinding.bind(view)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}