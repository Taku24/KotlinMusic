package kotolinmusic.taku24.com.kotlinmusic.Model

import android.net.Uri
import java.io.Serializable

/**
 * Created by taku24 on 2017/10/05.
 */

class Track : Serializable {

    var id: Long = 0                //コンテントプロバイダに登録されたID
    var albumId: Long = 0           //同じくトラックのアルバムのID
    var artistId: Long = 0          //同じくトラックのアーティストのID
    var path: String? = null        //実データのPATH
    var title: String? = null       //トラックタイトル
    var album: String? = null       //アルバムタイトル
    var artist: String? = null      //アーティスト名
    var uri: Uri? = null            // URI
    var duration: Long = 0          // 再生時間(ミリ秒)
    var trackNo: Int = 0            // アルバムのトラックナンバ

    constructor(id: Long, albumId:Long, artistId:Long, path:String, title:String, album:String, artist:String, uri:Uri, duration:Long, trackNo:Int){

    }
}
