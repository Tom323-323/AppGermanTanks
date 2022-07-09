package com.tomaslab.appgermantanks.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.tomaslab.appgermantanks.R
import com.tomaslab.appgermantanks.databinding.FragmentInfoBinding

class InfoFragment : Fragment(R.layout.fragment_info) {

    private var binding: FragmentInfoBinding?=null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInfoBinding.bind(view)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}