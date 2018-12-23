package com.artoo.sopt23.artoo_client_android.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.artoo.sopt23.artoo_client_android.Fragment.HomeThemeFragment
import com.artoo.sopt23.artoo_client_android.Fragment.HomeTodayFragment

class HomeFragmentStatePagerAdapter(fm : FragmentManager, val fragmentCount : Int): FragmentStatePagerAdapter(fm){
    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> return HomeTodayFragment()
            1 -> return HomeThemeFragment()
            else -> return null
        }
    }
    override fun getCount(): Int = fragmentCount
}