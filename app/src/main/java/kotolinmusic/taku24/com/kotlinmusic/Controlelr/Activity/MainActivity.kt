package kotolinmusic.taku24.com.kotlinmusic.Controlelr.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import butterknife.BindView
import butterknife.ButterKnife
import kotolinmusic.taku24.com.kotlinmusic.Controlelr.Adapter.ViewPagerAdapter

import kotolinmusic.taku24.com.kotlinmusic.R

class MainActivity : AppCompatActivity() {

    @BindView(R.id.viewPager) lateinit var mViewPager: ViewPager
    @BindView(R.id.tabLayout) lateinit var mTabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)

        val viewPagerAdapter: ViewPagerAdapter = ViewPagerAdapter(supportFragmentManager, this)
        mViewPager.adapter = viewPagerAdapter
        mTabLayout.setupWithViewPager(mViewPager)
    }
}
