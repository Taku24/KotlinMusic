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

class ItemArtistsAdapter(private val mMusicItems:List<Track>) : RecyclerView.Adapter<ItemArtistsAdapter.ItemArtistsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int):ItemArtistsAdapter.ItemArtistsViewHolder {
        val v = LayoutInflater.from(parent!!.context).inflate(R.layout.item_music, parent, false)
        return ItemArtistsViewHolder(v)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ItemArtistsAdapter.ItemArtistsViewHolder, position: Int) {
        holder.mTitle.text = "a" + position
    }

    class ItemArtistsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val mTitle: TextView by bindView(R.id.title)
    }

}
