package com.apjake.codetestuidesign.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.apjake.codetestuidesign.R
import com.apjake.codetestuidesign.adapter.ByRatesAdapter
import com.apjake.codetestuidesign.adapter.ByRoomAdapter
import com.apjake.codetestuidesign.databinding.FragmentByRatesBinding
import com.apjake.codetestuidesign.databinding.FragmentByRoomBinding
import com.apjake.codetestuidesign.helper.StringGenerator

class ByRatesFragment : Fragment() {

    private lateinit var binding: FragmentByRatesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentByRatesBinding.inflate(inflater, container, false)

        val adapter = ByRatesAdapter(requireContext())
        binding.rcyItems.adapter = adapter
        adapter.setNewDataList(StringGenerator.generate())

        return binding.root
    }
}