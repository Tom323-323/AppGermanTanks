package com.tomaslab.appgermantanks.presenter.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tomaslab.appgermantanks.R
import com.tomaslab.appgermantanks.databinding.FragmentContentBinding
import com.tomaslab.appgermantanks.databinding.FragmentInfoBinding


class ContentFragment : Fragment(R.layout.fragment_content) {

    private var binding:FragmentContentBinding?=null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentContentBinding.bind(view)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}