package com.softsquared.template.kotlin.src.main.myPage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.databinding.ActivityCategoryBinding
import com.softsquared.template.kotlin.databinding.ActivityMainBinding
import com.softsquared.template.kotlin.src.main.MainActivity

class CategoryActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityCategoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val intent = Intent(this, DigitalActivity::class.java)
        viewBinding.digital.setOnClickListener {
            startActivity(intent)
        }
        viewBinding.imageViewBtn.setOnClickListener{
            val intent2 = Intent(this,MainActivity::class.java)
            startActivity(intent2)
        }
    }
}