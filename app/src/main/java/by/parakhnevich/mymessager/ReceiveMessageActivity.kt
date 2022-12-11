package by.parakhnevich.mymessager

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class ReceiveMessageActivity : Activity() {

    companion object {
        val EXTRA_MESSAGE = "message"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recieve_message)
        findViewById<TextView>(R.id.messageView).setText(getIntent().getStringExtra(EXTRA_MESSAGE))
    }
}