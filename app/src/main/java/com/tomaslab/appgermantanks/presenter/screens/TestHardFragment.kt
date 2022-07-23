package com.tomaslab.appgermantanks.presenter.screens


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tomaslab.appgermantanks.R
import com.tomaslab.appgermantanks.databinding.FragmentTestHardBinding

private var binding: FragmentTestHardBinding?=null

class TestHardFragment : Fragment(R.layout.fragment_test_hard) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTestHardBinding.bind(view)
    }




    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }



}