package com.tomaslab.appgermantanks.presenter.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.tomaslab.appgermantanks.R
import com.tomaslab.appgermantanks.databinding.FragmentTestMainBinding

class TestMainFragment : Fragment(R.layout.fragment_test_main), View.OnClickListener {

    private var binding: FragmentTestMainBinding?=null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTestMainBinding.bind(view)

        binding?.btnMaintestToBack?.setOnClickListener(this)
        binding?.btnMaintestEasy?.setOnClickListener(this)
        binding?.btnMaintestMedium?.setOnClickListener(this)
        binding?.btnMaintestHard?.setOnClickListener(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    override fun onClick(view: View?) {
        when(view){
            binding?.btnMaintestToBack -> findNavController().navigate(R.id.action_testMainFragment_to_rootFragment)
            binding?.btnMaintestEasy -> findNavController().navigate(R.id.action_testMainFragment_to_testEasyFragment)
            binding?.btnMaintestMedium ->  findNavController().navigate(R.id.action_testMainFragment_to_testMediumFragment)
            binding?.btnMaintestHard -> findNavController().navigate(R.id.action_testMainFragment_to_testHardFragment)
        }
    }
}