package com.example.kotlinhm5mvvm.ui.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinhm5mvvm.databinding.FragmentThirdBinding
import com.example.kotlinhm5mvvm.view_models.SharedViewModel

class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        model.counts.observe(viewLifecycleOwner, {
            initView(it)
        })
    }

    private fun initView(it: ArrayList<String>) {
        val adapter = ThirdAdapter(it)
        binding.recyclerView.adapter = adapter
    }
}