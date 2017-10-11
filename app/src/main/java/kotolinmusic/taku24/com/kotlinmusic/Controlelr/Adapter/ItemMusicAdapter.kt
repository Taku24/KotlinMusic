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
 * Created by taku24 on 2017/10/09.
 */

class ItemMusicAdapter(private val mMusicItems:List<Track>) : RecyclerView.Adapter<ItemMusicAdapter.ItemMusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int):ItemMusicAdapter.ItemMusicViewHolder {
        val v = LayoutInflater.from(parent!!.context).inflate(R.layout.item_music, parent, false)
        return ItemMusicViewHolder(v)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ItemMusicAdapter.ItemMusicViewHolder, position: Int) {
        holder.mTitle.text = "a" + position
    }

    class ItemMusicViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val mTitle:TextView by bindView(R.id.title)
    }

}
