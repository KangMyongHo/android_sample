package com.example.sample

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by myong-hokang on 2018. 2. 23..
 */
class PageAdapter(fm: FragmentManager, private val context: Context) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return Fragment.instantiate(context,"android.support.v4.app.Fragment")
            1 -> return Fragment.instantiate(context, "android.support.v4.app.Fragment")
            2 -> return Fragment.instantiate(context, "android.support.v4.app.Fragment")
            3 -> return Fragment.instantiate(context, "android.support.v4.app.Fragment")
            4 -> return Fragment.instantiate(context, "android.support.v4.app.Fragment")
        }
        return Fragment.instantiate(context, "android.support.v4.app.Fragment")
    }

    override fun getCount(): Int {
        // Show 5 total pages.
        return 5
    }

    override fun getPageTitle(position: Int): CharSequence? {
        // return null to show no title.
        return null

    }

}