package com.apjake.codetestuidesign.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.apjake.codetestuidesign.R
import com.apjake.codetestuidesign.adapter.ByRoomAdapter
import com.apjake.codetestuidesign.databinding.FragmentByRoomBinding
import com.apjake.codetestuidesign.helper.StringGenerator

class ByRoomFragment : Fragment() {

    private lateinit var binding: FragmentByRoomBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentByRoomBinding.inflate(inflater, container, false)

        val adapter = ByRoomAdapter(requireContext())
        binding.rcyItems.adapter = adapter
        adapter.setNewDataList(StringGenerator.generate())

        return binding.root
    }

}