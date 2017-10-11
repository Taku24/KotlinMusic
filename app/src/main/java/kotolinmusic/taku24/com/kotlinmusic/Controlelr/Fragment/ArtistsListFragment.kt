package kotolinmusic.taku24.com.kotlinmusic.Controlelr.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotolinmusic.taku24.com.kotlinmusic.Controlelr.Adapter.ItemArtistsAdapter
import kotolinmusic.taku24.com.kotlinmusic.R
import kotterknife.bindView

/**
 * Created by taku24 on 2017/10/09.
 */

class ArtistsListFragment : Fragment() {

    val mRecyclerView: RecyclerView by bindView(R.id.artists_list_view)

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view: View = inflater!!.inflate(R.layout.fragment_artists_list, container, false)
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val artistsAdapter: ItemArtistsAdapter = ItemArtistsAdapter(ArrayList())
        val layoutManager: LinearLayoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        mRecyclerView.layoutManager = layoutManager
        mRecyclerView.adapter = artistsAdapter
    }

}
