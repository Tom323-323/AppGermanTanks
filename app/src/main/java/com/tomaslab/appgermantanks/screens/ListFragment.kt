package com.tomaslab.appgermantanks.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.tomaslab.appgermantanks.R
import com.tomaslab.appgermantanks.databinding.FragmentListBinding

class ListFragment : Fragment(R.layout.fragment_list) {

    private var binding: FragmentListBinding?=null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}