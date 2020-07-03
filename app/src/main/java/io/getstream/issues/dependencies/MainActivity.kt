package io.getstream.issues.dependencies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.getstream.sdk.chat.Chat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chatBuilder = Chat.Builder("", this)
    }
}