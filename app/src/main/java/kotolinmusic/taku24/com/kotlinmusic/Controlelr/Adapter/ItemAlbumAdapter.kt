package kotolinmusic.taku24.com.kotlinmusic.Controlelr.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotolinmusic.taku24.com.kotlinmusic.Model.Track
import kotolinmusic.taku24.com.kotlinmusic.R
import kotterknife.bindView

/**
 * Created by taku24 on 2017/10/11.
 */

class ItemAlbumAdapter(private val mMusicItems:List<Track>) : RecyclerView.Adapter<ItemAlbumAdapter.ItemAlbumViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int):ItemAlbumAdapter.ItemAlbumViewHolder {
        val v = LayoutInflater.from(parent!!.context).inflate(R.layout.item_music, parent, false)
        return ItemAlbumViewHolder(v)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ItemAlbumAdapter.ItemAlbumViewHolder, position: Int) {
        holder.mTitle.text = "a" + position
    }

    class ItemAlbumViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val mTitle: TextView by bindView(R.id.title)
    }

}
