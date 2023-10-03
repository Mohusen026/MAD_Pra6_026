package com.mo_husen.mad_pra6_026
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val play_btn = findViewById<FloatingActionButton>(R.id.btn_play)
        val btn_next= findViewById<FloatingActionButton>(R.id.btn_next)
        val btn_prev = findViewById<FloatingActionButton>(R.id.btn_prev)
        val stop_btn=findViewById<FloatingActionButton>(R.id.stop)
        play_btn.setOnClickListener()
        {
            play()
        }
        stop_btn.setOnClickListener()
        {
            stop()
        }
    }
    fun play(){

        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply {
            startService(this)
        }
    }
    fun stop(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply {
            stopService(this)
        }
    }
}