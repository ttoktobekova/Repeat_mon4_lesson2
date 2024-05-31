package com.example.repeatmon4lesson2.UI.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.repeatmon4lesson2.R
import com.example.repeatmon4lesson2.databinding.FragmentIosBinding


class IosFragment : Fragment() {

    private lateinit var binding: FragmentIosBinding
    private val args by navArgs<IosFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentIosBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() {
        binding.tvEmail.text = args.model?.email
        binding.tvPassword.text = args.model?.password
    }


}