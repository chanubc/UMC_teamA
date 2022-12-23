package com.softsquared.template.kotlin.src.main.myPage

import android.content.Intent
import android.os.Bundle
import android.system.Os.open
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.databinding.FragmentMainHomeBinding
import org.json.JSONObject
import org.json.JSONTokener
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL
import java.nio.channels.AsynchronousSocketChannel.open
import java.nio.channels.DatagramChannel.open
import java.nio.channels.SocketChannel.open


class MainHomeFragment : Fragment() {

    lateinit var binding: FragmentMainHomeBinding
    lateinit var adapter: MainHomeAdapter
    var dataList = ArrayList<MainHomeData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainHomeBinding.inflate(layoutInflater)

        // Inflate the layout for this fragment
        adddata()
//        mainUrl()


        initBtnCatxegory()
        initRecyclerView()

        return binding.root
    }



    private fun initBtnCatxegory() {
        binding.btnCategory.setOnClickListener {
            val intent = Intent(context, CategoryActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initRecyclerView() {

        //기존 adapter(recyclerview adpater)
        binding.MainHomerecyclerView.layoutManager = LinearLayoutManager(
            context, LinearLayoutManager.VERTICAL, false
        )
        adapter = MainHomeAdapter(dataList)
        binding.MainHomerecyclerView.adapter = adapter


        adapter.itemClickListener = object : MainHomeAdapter.OnItemClickListener {
            override fun OnItemClick(data: MainHomeData) {
                /*  Toast.makeText(getActivity(),"show", Toast.LENGTH_SHORT).show()
                   val intent = packageManager.getLaunchIntentForPackage(data.appackname)
                   startActivity(intent)*/
                val intent = Intent(context, detailPageActivity::class.java)
                startActivity(intent)

                Log.d("test", "test")
            }
        }
    }

    /*  fun mainUrl() {
          val url = URL("https://www.peteworld.shop")
          val connection = url.openConnection()
          BufferedReader(InputStreamReader(connection.getInputStream())).use { inp ->
              var line: String?
              while (inp.readLine().also { line = it } != null) {
                  Log.d("tag",line.toString())
              }
          }
      }*/


     private fun adddata() {
         dataList.add(MainHomeData(R.drawable.coffee,"스타벅스 아메리카노 쿠폰","방배4동","3250","1"))
         dataList.add(MainHomeData(R.drawable.iphone134,"아이폰14","반포동","80,0000","2"))
         dataList.add(MainHomeData(R.drawable.iphone,"아이폰14","반포동","80,0000","2"))
         dataList.add(MainHomeData(R.drawable.iphone,"아이폰14","반포동","80,0000","2"))
         dataList.add(MainHomeData(R.drawable.iphone,"아이폰14","반포동","80,0000","2"))
         dataList.add(MainHomeData(R.drawable.iphone,"아이폰14","반포동","80,0000","2"))
         dataList.add(MainHomeData(R.drawable.iphone,"아이폰14","반포동","800000","2"))
         dataList.add(MainHomeData(R.drawable.iphone,"아이폰14","반포동","800000","2"))


     }


}