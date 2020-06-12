package com.example.unit_and_ui_testing_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById<TextView>(R.id.helloWorldText)

        val button = findViewById<Button>(R.id.welcomeButton)
        button.setOnClickListener(){

            text.text = "The button has been clicked"
        }

        val person = Person("John")
        val personResponse = person.greeting()
        text.text = personResponse
    }

    //Don't forget to update `AndroidManifest.xml
    //    <activity android:name=".SecondActivity"
    //    android:parentActivityName=".MainActivity"/>

    //    We don't need to add an setOnClickListener because we added `android:onClick="sendMessage"` in `activity_main.xml`
    fun sendMessage(view: View) {
        val message = "String from Main Activity"
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

}