package com.example.modulecommunication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.modulecommunication.databinding.FragmentFirstBinding
import com.example.second_module.SecondFragment
import com.example.third_module.ThirdFragment

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListener()
    }

    private fun setListener() {
        binding.mainLayout.setOnClickListener {

        }

        binding.first.setOnClickListener {

        }

        binding.second.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainerView, SecondFragment())
                .commit()
        }

        binding.third.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainerView, ThirdFragment())
                .commit()
        }
    }

}