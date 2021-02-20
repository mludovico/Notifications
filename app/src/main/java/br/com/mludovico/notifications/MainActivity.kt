package br.com.mludovico.notifications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        send_button.setOnClickListener {
            this.showNotification("1234", "Bootcamp Everis", "Kotlin Android Notification")
        }

        Log.i("****newToken**", FirebaseInstanceId.getInstance().token.toString())
    }
}