package com.example.repeatmon4lesson2.UI.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.repeatmon4lesson2.ADAPTER.TaskAdapter
import com.example.repeatmon4lesson2.R
import com.example.repeatmon4lesson2.databinding.FragmentHomeBinding
import com.example.repeatmon4lesson2.models.RegisterModel

class HomeFragment : Fragment() {
    private val adapter = TaskAdapter()


    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()
    }

    private fun setupListener() {
        binding.btnTransition.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()
            val data = RegisterModel(email, password)
            findNavController().navigate(
                HomeFragmentDirections.actionHomeFragmentToIosFragment(data)
            )
        }
    }


}