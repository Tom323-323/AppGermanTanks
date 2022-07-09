package com.tomaslab.appgermantanks.presenter.screens

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tomaslab.appgermantanks.R
import com.tomaslab.appgermantanks.databinding.FragmentInfoBinding

class InfoFragment : Fragment(R.layout.fragment_info) {

    private var binding: FragmentInfoBinding?=null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInfoBinding.bind(view)

        // Button back to Menu.
        binding!!.btnInfoToBack.setOnClickListener {
            findNavController().navigate(R.id.action_infoFragment_to_rootFragment)
        }

        //Button to rate app in PlayMarket
        binding!!.btnInfoToRate.setOnClickListener {
            val url = "market://details?id=com.tomas.directory_l5"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}