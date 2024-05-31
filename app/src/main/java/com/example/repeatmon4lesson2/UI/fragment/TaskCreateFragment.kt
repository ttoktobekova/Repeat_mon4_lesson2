package com.example.repeatmon4lesson2.UI.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import com.example.repeatmon4lesson2.R
import com.example.repeatmon4lesson2.databinding.FragmentTaskCreateBinding

class TaskCreateFragment : Fragment(R.layout.fragment_task_create) {

    private lateinit var binding: FragmentTaskCreateBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTaskCreateBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}