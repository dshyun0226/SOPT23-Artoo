package com.artoo.sopt23.artoo_client_android.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.artoo.sopt23.artoo_client_android.Adapter.TodayRecyclerViewAdapter
import com.artoo.sopt23.artoo_client_android.Data.TodayData
import com.artoo.sopt23.artoo_client_android.R
import kotlinx.android.synthetic.main.fragment_home_today.*
import kotlinx.android.synthetic.main.fragment_home_today.view.*

class HomeTodayFragment : Fragment() {
    lateinit var todayRecyclerViewAdapter: TodayRecyclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.fragment_home_today, container, false)
        setOnBtnClickListener(view)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    private fun setOnBtnClickListener(view: View){
        //fragment 새로 구현? 모르겟당
        view.img_fragment_today_artist0.setOnClickListener {
            view.txt_fragment_today_detail_artist.text = "최윤정 작가"
            //setRecyclerView(0)
        }
        view.img_fragment_today_artist1.setOnClickListener {
            view.txt_fragment_today_detail_artist.text = "이세은 작가"
            //setRecyclerView(1)
        }
        view.img_fragment_today_artist2.setOnClickListener {
            view.txt_fragment_today_detail_artist.text = "윤여진 작가"
            //setRecyclerView(2)
        }
        view.img_fragment_today_artist3.setOnClickListener {
            view.txt_fragment_today_detail_artist.text = "한선민 작가"
            //setRecyclerView(3)
        }
        view.img_fragment_today_artist4.setOnClickListener {
            view.txt_fragment_today_detail_artist.text = "김정음 작가"
            //setRecyclerView(4)
        }
    }

    private fun setRecyclerView(pos : Int){
        //초기 화면에 나타나야 하는것
        //누를 때마다 바뀌는 것
        var position = pos
        if (position==1){

        }
        var dataList: ArrayList<TodayData> = ArrayList()
        var img_url:String = "http://www.newsa.co.kr/news/photo/201809/187929_146645_3554.jpg"
        dataList.add(TodayData("가","2014 作",img_url))
        dataList.add(TodayData("나","2015 作",img_url))
        dataList.add(TodayData("다","2016 作",img_url))
        dataList.add(TodayData("라","2017 作",img_url))
        dataList.add(TodayData("마","2018 作",img_url))
        todayRecyclerViewAdapter = TodayRecyclerViewAdapter(activity!!, dataList)
        rv_fragment_home_today_list.adapter = todayRecyclerViewAdapter
        rv_fragment_home_today_list.layoutManager = LinearLayoutManager(activity,LinearLayout.HORIZONTAL,false)
    }
}