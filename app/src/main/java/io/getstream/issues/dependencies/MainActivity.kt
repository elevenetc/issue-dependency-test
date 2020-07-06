package io.getstream.issues.dependencies

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.getstream.sdk.chat.Chat
import okhttp3.MultipartBody.Companion.FORM
import okhttp3.MultipartBody.Part.Companion.createFormData
import okhttp3.MediaType.Companion.toMediaTypeOrNull

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chatBuilder = Chat.Builder("", this)

        val part = createFormData("name", "value")
        val form = FORM
        val toMediaTypeOrNull = "png".toMediaTypeOrNull()
    }
}