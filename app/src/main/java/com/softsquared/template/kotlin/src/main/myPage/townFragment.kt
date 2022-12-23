package com.softsquared.template.kotlin.src.main.myPage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.databinding.FragmentTownBinding


class townFragment : Fragment() {


    lateinit var binding: FragmentTownBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTownBinding.inflate(layoutInflater)
        // 여기에 코드 작성







        return binding.root
    }

}