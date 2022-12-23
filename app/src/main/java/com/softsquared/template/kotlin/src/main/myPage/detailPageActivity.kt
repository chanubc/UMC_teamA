package com.softsquared.template.kotlin.src.main.myPage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.databinding.ActivityDetailPageBinding

class detailPageActivity : AppCompatActivity() {
    lateinit var binding:ActivityDetailPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailPageBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        adddata()
        initNext()
    }

    private fun initNext() {

        binding.button.setOnClickListener {
          val intent = Intent(this,ChatActivity::class.java)
            startActivity(intent)
        }
    }

    private fun adddata() {

        binding.apply {
            detailTextManName.text = "김민수"
            detailTextLoacation.text = "서울시 강남구"
            detailTextMainName.text="아이폰14"
            detailTextCategory.text="전자제품"
            detailTextLongtext.text="올해 9월에 구입후 실사용 3번\n그냥 터치 정도만 하고 중고로 팝니다\n직거래만 가능합니다"
            textView5.text="800,000원"
        }
        /*binding.detailPageTvTitle.text = intent.getStringExtra("title")
        binding.detailPageTvContent.text = intent.getStringExtra("content")*/
    }
}