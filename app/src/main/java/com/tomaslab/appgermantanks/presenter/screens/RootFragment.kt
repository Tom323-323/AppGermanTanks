package com.tomaslab.appgermantanks.presenter.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.tomaslab.appgermantanks.R
import com.tomaslab.appgermantanks.databinding.FragmentRootBinding

class RootFragment : Fragment(R.layout.fragment_root), View.OnClickListener {

    private var binding: FragmentRootBinding?=null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRootBinding.bind(view)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    override fun onClick(view: View?) {
        when(view){
            binding?.btRootTanks -> onList(0)
            binding?.btnRootSauMortar -> onList(1)
            binding?.btnRootBtr -> onList(2)
            binding?.btnRootTest -> findNavController().navigate(R.id.action_rootFragment_to_testMainFragment)
            binding?.btnRootInfo -> findNavController().navigate(R.id.action_rootFragment_to_infoFragment)
        }
    }

    private fun onList(index:Int){
        findNavController().navigate(R.id.action_rootFragment_to_listFragment,
            bundleOf(ListFragment.INDEX to index)
        )
    }

}