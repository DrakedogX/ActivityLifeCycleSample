package com.example.jojotest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifeCycleLog("[MainActivity]onCreate()")
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_goto_detail).setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        lifeCycleLog("[MainActivity]onStart()")
    }

    override fun onRestart() {
        super.onRestart()
        lifeCycleLog("[MainActivity]onRestart()")
    }
    override fun onResume() {
        super.onResume()
        lifeCycleLog("[MainActivity]onResume()")
    }

    override fun onPause() {
        super.onPause()
        lifeCycleLog("[MainActivity]onPause()")
    }

    override fun onStop() {
        super.onStop()
        lifeCycleLog("[MainActivity]onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        lifeCycleLog("[MainActivity]onDestroy()")
    }
}
