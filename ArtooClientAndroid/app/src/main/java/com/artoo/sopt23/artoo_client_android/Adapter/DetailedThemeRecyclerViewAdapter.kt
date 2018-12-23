package com.artoo.sopt23.artoo_client_android.Adapter

import android.content.Context
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.artoo.sopt23.artoo_client_android.Data.DetailedThemeData
import com.artoo.sopt23.artoo_client_android.Data.ThemeData
import com.artoo.sopt23.artoo_client_android.R
import de.hdodenhof.circleimageview.CircleImageView
import java.net.URI

class DetailedThemeRecyclerViewAdapter(val ctx: Context, val dataList: ArrayList<DetailedThemeData>): RecyclerView.Adapter<DetailedThemeRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_detailed_theme, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.img.setImageURI(dataList[position].img_url as Uri)
    }

    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        val img: ImageView = itemView.findViewById(R.id.img_rv_item_detailed_theme) as ImageView
    }
}