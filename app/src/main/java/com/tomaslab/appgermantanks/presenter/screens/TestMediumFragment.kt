package com.tomaslab.appgermantanks.presenter.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.tomaslab.appgermantanks.R
import com.tomaslab.appgermantanks.databinding.FragmentTestMediumBinding

private var binding: FragmentTestMediumBinding?=null

class TestMediumFragment : Fragment(R.layout.fragment_test_medium) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTestMediumBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}