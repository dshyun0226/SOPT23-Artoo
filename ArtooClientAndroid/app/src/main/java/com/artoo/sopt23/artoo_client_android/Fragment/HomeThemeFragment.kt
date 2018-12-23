package com.artoo.sopt23.artoo_client_android.Fragment

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.artoo.sopt23.artoo_client_android.Adapter.ThemeRecyclerViewAdapter
import com.artoo.sopt23.artoo_client_android.Data.ThemeData

import com.artoo.sopt23.artoo_client_android.R
import kotlinx.android.synthetic.main.fragment_home_theme.*
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class HomeThemeFragment : Fragment() {

    lateinit var themeRecyclerViewAdapter: ThemeRecyclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home_theme, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setRecyclerView()
    }

    private fun setRecyclerView(){
        var dataList: ArrayList<ThemeData> = ArrayList()

        var img_url: ArrayList<String> = ArrayList()
        img_url.add("data:image/jpeg;base64,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")
        img_url.add("http://img.newspim.com/news/2018/03/31/1803311718414850.jpg")
        img_url.add("http://www.newsa.co.kr/news/photo/201809/187929_146645_3554.jpg")
        img_url.add("https://www.nemopan.com/files/attach/images/2582/269/848/493724be0c020.jpg")

        dataList.add(ThemeData("# 거실에 걸어두면 예쁠 것 같아!", "허전했던 벽에 한번 걸어보자", img_url))
        dataList.add(ThemeData("# 카페에 거는 순간 감성카페로 등극!", "카페 분위기에 어울리는 그림을 찾아보자", img_url))

        themeRecyclerViewAdapter = ThemeRecyclerViewAdapter(activity!!, dataList)
        rv_fragment_theme_list.adapter = themeRecyclerViewAdapter
        rv_fragment_theme_list.layoutManager = LinearLayoutManager(activity)
    }
}
