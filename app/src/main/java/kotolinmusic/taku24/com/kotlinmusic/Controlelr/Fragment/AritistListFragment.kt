package kotolinmusic.taku24.com.kotlinmusic.Controlelr.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotolinmusic.taku24.com.kotlinmusic.R

/**
 * Created by taku24 on 2017/10/09.
 */

class AritistListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view: View = inflater!!.inflate(R.layout.fragment_aritist_list, container, false)
        return view
    }

}
