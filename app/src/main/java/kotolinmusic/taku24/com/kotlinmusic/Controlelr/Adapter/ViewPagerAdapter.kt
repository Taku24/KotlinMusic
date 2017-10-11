package kotolinmusic.taku24.com.kotlinmusic.Controlelr.Adapter

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import kotolinmusic.taku24.com.kotlinmusic.Controlelr.Fragment.AlbumListFragment
import kotolinmusic.taku24.com.kotlinmusic.Controlelr.Fragment.ArtistsListFragment
import kotolinmusic.taku24.com.kotlinmusic.Controlelr.Fragment.MusicListFragment
import kotolinmusic.taku24.com.kotlinmusic.R

/**
 * Created by taku24 on 2017/10/09.
 */

class ViewPagerAdapter(fm:FragmentManager, context: Context) : FragmentPagerAdapter(fm) {

    private var mPageList:ArrayList<Fragment> = ArrayList()
    private var mContext:Context? = null

    init {
        mContext = context
        mPageList.add(AlbumListFragment())
        mPageList.add(ArtistsListFragment())
        mPageList.add(MusicListFragment())
    }

    override fun getCount(): Int {
        return mPageList.count()
    }

    override fun getItem(position: Int): Fragment {
        return mPageList.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence {
        super.getPageTitle(position)

        when (position){
            0 -> return mContext!!.getString(R.string.album)

            1 -> return mContext!!.getString(R.string.aritist)

            2 -> return mContext!!.getString(R.string.music)

            else -> return ""
        }
    }

}
