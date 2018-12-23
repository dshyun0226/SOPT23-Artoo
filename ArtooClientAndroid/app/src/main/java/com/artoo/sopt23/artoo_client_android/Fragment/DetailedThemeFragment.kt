package com.artoo.sopt23.artoo_client_android.Fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.artoo.sopt23.artoo_client_android.Adapter.DetailedThemeRecyclerViewAdapter
import com.artoo.sopt23.artoo_client_android.Data.DetailedThemeData

import com.artoo.sopt23.artoo_client_android.R
import kotlinx.android.synthetic.main.fragment_detailed_theme.*

class DetailedThemeFragment : Fragment() {
    lateinit var detailedThemeRecyclerViewAdapter: DetailedThemeRecyclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_detailed_theme, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setRecyclerView()
    }

    private fun setRecyclerView() {
        var dataList: ArrayList<DetailedThemeData> = ArrayList()

        var img_url: ArrayList<String> = ArrayList()
        img_url.add("data:image/jpeg;base64")
        dataList.add(DetailedThemeData(img_url))
        dataList.add(DetailedThemeData(img_url))
        dataList.add(DetailedThemeData(img_url))
        dataList.add(DetailedThemeData(img_url))
        dataList.add(DetailedThemeData(img_url))
        dataList.add(DetailedThemeData(img_url))
        dataList.add(DetailedThemeData(img_url))
        dataList.add(DetailedThemeData(img_url))
        dataList.add(DetailedThemeData(img_url))
        dataList.add(DetailedThemeData(img_url))
        dataList.add(DetailedThemeData(img_url))
        dataList.add(DetailedThemeData(img_url))
        dataList.add(DetailedThemeData(img_url))
        dataList.add(DetailedThemeData(img_url))
        dataList.add(DetailedThemeData(img_url))

        detailedThemeRecyclerViewAdapter = DetailedThemeRecyclerViewAdapter(activity!!, dataList)
        rv_fragment_detailed_theme_list.adapter = detailedThemeRecyclerViewAdapter
        rv_fragment_detailed_theme_list.layoutManager = GridLayoutManager(activity,2)

    }
}
