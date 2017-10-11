package kotolinmusic.taku24.com.kotlinmusic.Controlelr.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import kotolinmusic.taku24.com.kotlinmusic.Controlelr.Adapter.ViewPagerAdapter

import kotolinmusic.taku24.com.kotlinmusic.R
import kotterknife.bindView

class MainActivity : AppCompatActivity() {

    val mViewPager:ViewPager by bindView(R.id.viewPager)
    val mTabLayout:TabLayout by bindView(R.id.tabLayout)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPagerAdapter: ViewPagerAdapter = ViewPagerAdapter(supportFragmentManager, this)
        mViewPager.adapter = viewPagerAdapter
        mTabLayout.setupWithViewPager(mViewPager)
    }
}
