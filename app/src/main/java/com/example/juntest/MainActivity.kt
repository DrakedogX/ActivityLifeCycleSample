package com.example.juntest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LifeCycleLog("[MainActivity]onCreate()")
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_goto_detail).setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        LifeCycleLog("[MainActivity]onStart()")
    }

    override fun onRestart() {
        super.onRestart()
        LifeCycleLog("[MainActivity]onRestart()")
    }
    override fun onResume() {
        super.onResume()
        LifeCycleLog("[MainActivity]onResume()")
    }

    override fun onPause() {
        super.onPause()
        LifeCycleLog("[MainActivity]onPause()")
    }

    override fun onStop() {
        super.onStop()
        LifeCycleLog("[MainActivity]onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        LifeCycleLog("[MainActivity]onDestroy()")
    }
}
