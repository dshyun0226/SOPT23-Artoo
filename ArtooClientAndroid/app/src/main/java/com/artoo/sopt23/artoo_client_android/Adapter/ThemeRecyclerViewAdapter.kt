package com.artoo.sopt23.artoo_client_android.Adapter

import android.content.Context
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.artoo.sopt23.artoo_client_android.Data.ThemeData
import com.artoo.sopt23.artoo_client_android.R
import de.hdodenhof.circleimageview.CircleImageView
import java.net.URI

class ThemeRecyclerViewAdapter(val ctx: Context, val dataList: ArrayList<ThemeData>): RecyclerView.Adapter<ThemeRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_theme, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.title.text = dataList[position].title
        holder.desc.text = dataList[position].desc
        /*holder.img0.setImageURI(dataList[position].img_url[0] as Uri)
        holder.img1.setImageURI(dataList[position].img_url[1] as Uri)
        holder.img2.setImageURI(dataList[position].img_url[2] as Uri)
        holder.img3.setImageURI(dataList[position].img_url[3] as Uri)*/
    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        val title: TextView = itemView.findViewById(R.id.txt_rv_item_theme_title) as TextView
        val desc: TextView = itemView.findViewById(R.id.txt_rv_item_theme_desc) as TextView
        val plus: TextView = itemView.findViewById(R.id.txt_rv_item_theme_plus) as TextView
        //val img0: CircleImageView = itemView.findViewById(R.id.civ_rv_item_theme_0) as CircleImageView
        //val img1: CircleImageView = itemView.findViewById(R.id.civ_rv_item_theme_1) as CircleImageView
        //val img2: CircleImageView = itemView.findViewById(R.id.civ_rv_item_theme_2) as CircleImageView
        //val img3: CircleImageView = itemView.findViewById(R.id.civ_rv_item_theme_3) as CircleImageView
    }
}