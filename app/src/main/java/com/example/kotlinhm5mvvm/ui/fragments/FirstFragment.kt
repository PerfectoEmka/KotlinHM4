package com.example.kotlinhm5mvvm.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinhm5mvvm.databinding.FragmentFirstBinding
import com.example.kotlinhm5mvvm.view_models.SharedViewModel

class FirstFragment : Fragment() {

    private lateinit var model: SharedViewModel
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        binding.btnMinus.setOnClickListener {
            model.clickCount("-")
        }

        binding.btnPlus.setOnClickListener {
            model.clickCount("+")
        }
    }
}