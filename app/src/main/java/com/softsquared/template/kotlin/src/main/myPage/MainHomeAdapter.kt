package com.softsquared.template.kotlin.src.main.myPage

import android.app.PendingIntent.getActivity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.softsquared.template.kotlin.databinding.RowBinding

class  MainHomeAdapter(val items: ArrayList<MainHomeData>) : RecyclerView.Adapter<MainHomeAdapter.ViewHolder>() {

    interface OnItemClickListener {
        fun OnItemClick(data: MainHomeData)
    }

/*    fun moveItem(oldPos: Int, newPos: Int) {
        val item = items[oldPos]
        items.removeAt(oldPos)
        items.add(newPos, item)
        notifyItemMoved(oldPos, newPos)
    }

    fun removeItem(pos: Int) {
        items.removeAt(pos)
        notifyItemRemoved(pos)
    }*/

    var itemClickListener: OnItemClickListener? = null //초기값 null값

    inner class ViewHolder(val binding: RowBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.recyclerViewHome.setOnClickListener {
                itemClickListener?.OnItemClick(items[adapterPosition]) //?는 null일 수 도 있다고 알려주는 역할
               /* val intent = Intent(this,detailPageActivity::class.java)
                startActivity(intent)*/



            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RowBinding.inflate(LayoutInflater.from(parent.context),  parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        var isClicked: Boolean = true

        holder.binding.apply {
//            imageView = items[position].img
            textName.text = items[position].name.toString()
            textLocate.text = items[position].location.toString()
            textPrice.text = items[position].price.toString()+"원"
//            textViewDifficulty.text= "난이도 ${position+1}"
        }
        /* holder.binding.textName.text = items[position].label.toString()
         holder.binding.textCost.text = items[position].value.toInt().toString()+" won"*/
//        holder.binding.
//        holder.binding.textView2.visibility = View.GONE

        /*holder.binding.textView.setOnClickListener {
            if (isClicked) {
                holder.binding.textView2.visibility = View.VISIBLE
                isClicked = false
            } else {
                holder.binding.textView2.visibility = View.GONE
                isClicked = true
            }
        }*/


    }


    /*fun onRenewViewViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.textName.text = items[position].label.toString()
        holder.binding.textCost.text = items[position].value.toInt().toString()
    }*/

    override fun getItemCount(): Int {
        return items.size
    }


}