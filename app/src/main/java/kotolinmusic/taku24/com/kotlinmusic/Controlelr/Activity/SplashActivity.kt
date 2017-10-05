package kotolinmusic.taku24.com.kotlinmusic.Controlelr.Activity

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import kotolinmusic.taku24.com.kotlinmusic.R
import android.content.DialogInterface
import android.os.Handler
import android.support.v7.app.AlertDialog


/**
 * Created by taku24 on 2017/10/05.
 */

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val handler: Handler = Handler()
        handler.postDelayed({
            permissionsRequest()
        }, 2000)
    }

    private fun permissionsRequest() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED ||
                ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE), 111)

        } else {
            startMainActivity()
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int,
                                            permissions: Array<String>, grantResults: IntArray) {
        when (requestCode) {
            111 -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    startMainActivity()
                } else {
                    permissionsNotSelected()
                }
            }
        }
    }

    private fun permissionsNotSelected() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(getText(R.string.permission_title).toString())
        builder.setMessage(getText(R.string.permission_message).toString())
        builder.setNeutralButton(getText(R.string.cancel), { dialog, _ ->
            dialog.cancel()
            System.exit(1)
        })
        val noInternet = builder.create()
        noInternet.show()
    }

    private fun startMainActivity() {
        val intent: Intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
