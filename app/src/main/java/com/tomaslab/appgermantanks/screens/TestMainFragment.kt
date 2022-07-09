package com.tomaslab.appgermantanks.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.tomaslab.appgermantanks.R
import com.tomaslab.appgermantanks.databinding.FragmentTestMainBinding


class TestMainFragment : Fragment(R.layout.fragment_test_main) {

    private var binding: FragmentTestMainBinding?=null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTestMainBinding.bind(view)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}