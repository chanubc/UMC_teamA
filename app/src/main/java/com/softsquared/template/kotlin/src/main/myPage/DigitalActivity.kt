package com.softsquared.template.kotlin.src.main.myPage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.databinding.ActivityDigitalBinding

class DigitalActivity : AppCompatActivity() {
    val binding by lazy { ActivityDigitalBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val profileList = arrayListOf(
            profiles(R.drawable.digital, "아이폰 11 퍼플 색상", "반포동", "352000원"),
            profiles(R.drawable.digital, "아이폰 11 퍼플 색상", "반포동", "352000원"),
            profiles(R.drawable.digital, "아이폰 11 퍼플 색상", "반포동", "352000원"),
            profiles(R.drawable.digital, "아이폰 11 퍼플 색상", "반포동", "352000원"),
            profiles(R.drawable.digital, "아이폰 11 퍼플 색상", "반포동", "352000원"),
            profiles(R.drawable.digital, "아이폰 11 퍼플 색상", "반포동", "352000원"),
            profiles(R.drawable.digital, "아이폰 11 퍼플 색상", "반포동", "352000원"),
            profiles(R.drawable.digital, "아이폰 11 퍼플 색상", "반포동", "352000원"),
            profiles(R.drawable.digital, "아이폰 11 퍼플 색상", "반포동", "352000원"),
            profiles(R.drawable.digital, "아이폰 11 퍼플 색상", "반포동", "352000원"),
            profiles(R.drawable.digital, "아이폰 11 퍼플 색상", "반포동", "352000원"),
            profiles(R.drawable.digital, "아이폰 11 퍼플 색상", "반포동", "352000원"),
            profiles(R.drawable.digital, "아이폰 11 퍼플 색상", "반포동", "352000원"),
            profiles(R.drawable.digital, "아이폰 11 퍼플 색상", "반포동", "352000원"),
            profiles(R.drawable.digital, "아이폰 11 퍼플 색상", "반포동", "352000원"),
            profiles(R.drawable.digital, "아이폰 11 퍼플 색상", "반포동", "352000원"),
            profiles(R.drawable.digital, "아이폰 11 퍼플 색상", "반포동", "352000원"),
            profiles(R.drawable.digital, "아이폰 11 퍼플 색상", "반포동", "352000원"))

        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = ProfileAdapter(profileList)
    }
}