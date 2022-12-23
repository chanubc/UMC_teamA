package com.softsquared.template.kotlin.src.main.myPage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.softsquared.template.kotlin.R

class ProfileAdapter(val profileList: ArrayList<profiles>) :
    RecyclerView.Adapter<ProfileAdapter.CustomviewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProfileAdapter.CustomviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CustomviewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfileAdapter.CustomviewHolder, position: Int) {
        holder.picture.setImageResource(profileList.get(position).picture)
        holder.name.text = profileList.get(position).name
        holder.location.text = profileList.get(position).location
        holder.price.text = profileList.get(position).price.toString()
    }

    override fun getItemCount(): Int = profileList.size


    class CustomviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val picture = itemView.findViewById<ImageView>(R.id.imageView)
        val name = itemView.findViewById<TextView>(R.id.text_name)
        val location = itemView.findViewById<TextView>(R.id.text_locate)
        val price = itemView.findViewById<TextView>(R.id.text_price)
    }
}
