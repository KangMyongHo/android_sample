package com.example.sample

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View

/**
 * Created by myong-hokang on 2018. 2. 9..
 */

class MainActivity : AppCompatActivity() {

    private var mSectionsPagerAdapter: PageAdapter? = null
    /**
     * The [ViewPager] that will host the section contents.
     */
    private var mViewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // toolbar
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = PageAdapter(supportFragmentManager, this)


        // Set up the ViewPager with the sections adapter.
        mViewPager = findViewById<ViewPager?>(R.id.container)
        mViewPager!!.adapter = mSectionsPagerAdapter

        // tab
        val tabLayout = findViewById<View>(R.id.tabs) as TabLayout
        tabLayout.setupWithViewPager(mViewPager)

        // set icons
        tabLayout.getTabAt(0)!!.setIcon(R.mipmap.ic_launcher)
        tabLayout.getTabAt(1)!!.setIcon(R.mipmap.ic_launcher)
        tabLayout.getTabAt(2)!!.setIcon(R.mipmap.ic_launcher)
        tabLayout.getTabAt(3)!!.setIcon(R.mipmap.ic_launcher)
        tabLayout.getTabAt(4)!!.setIcon(R.mipmap.ic_launcher)


    }
}
