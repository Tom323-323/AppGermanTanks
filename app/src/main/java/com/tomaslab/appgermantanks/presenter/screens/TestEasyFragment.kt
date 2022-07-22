package com.tomaslab.appgermantanks.presenter.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.tomaslab.appgermantanks.R
import com.tomaslab.appgermantanks.databinding.FragmentTestEasyBinding


class TestEasyFragment : Fragment(R.layout.fragment_test_easy) {

    private var binding: FragmentTestEasyBinding?=null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTestEasyBinding.bind(view)

        binding!!.btnBackTesteasy.setOnClickListener {
            findNavController().navigate(R.id.action_testEasyFragment_to_testMainFragment)
        }

        binding!!.btnTestEasy1.setOnClickListener {

        }

        binding!!.btnTestEasy2.setOnClickListener {

        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}