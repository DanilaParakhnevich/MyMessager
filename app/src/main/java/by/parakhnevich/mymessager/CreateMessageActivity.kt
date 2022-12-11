package by.parakhnevich.mymessager

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.EditText
import android.widget.LinearLayout

class CreateMessageActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_message)
    }

    fun onClick(view: View) {
        val input = findViewById<EditText>(R.id.message).text.toString()
        if (findViewById<CheckBox>(R.id.pick).isActivated) {
            var intent = Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_TEXT, input)
            intent.putExtra(Intent.EXTRA_SUBJECT, "Test message")
            startActivity(intent)
        } else {
            var intent = Intent(this, ReceiveMessageActivity::class.java)
            intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, input)
            startActivity(intent)
        }
    }
}