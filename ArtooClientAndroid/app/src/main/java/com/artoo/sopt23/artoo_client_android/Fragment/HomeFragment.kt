package com.artoo.sopt23.artoo_client_android.Fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.artoo.sopt23.artoo_client_android.Adapter.HomeFragmentStatePagerAdapter

import com.artoo.sopt23.artoo_client_android.R
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {
    lateinit var inflater: LayoutInflater
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        this.inflater = inflater


        var view: View = inflater.inflate(R.layout.fragment_home, container, false)
        configureTopNavigation(view)
        return view
    }

    private fun configureTopNavigation(view: View) {
        view.vp_top_navi_act_frag_pager.adapter = HomeFragmentStatePagerAdapter(childFragmentManager, 2)
        // ViewPager와 Tablayout을 엮어줍니다!
        view.tl_top_navi_act_top_menu.setupWithViewPager(view.vp_top_navi_act_frag_pager)
        //TabLayout에 붙일 layout을 찾아준 다음
        val topNaviLayout : View = inflater.inflate(R.layout.top_navigation_tab_home, null, false)
        //탭 하나하나 TabLayout에 연결시켜줍니다.
        view.tl_top_navi_act_top_menu.getTabAt(0)!!.customView = topNaviLayout.findViewById(R.id.btn_top_navi_home_today_tab) as RelativeLayout
        view.tl_top_navi_act_top_menu.getTabAt(1)!!.customView = topNaviLayout.findViewById(R.id.btn_top_navi_home_theme_tab) as RelativeLayout
    }
}
