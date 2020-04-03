package com.example.jojotest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifeCycleLog("[DetailActivity]onCreate()")
        setContentView(R.layout.activity_detail)
    }

    override fun onStart() {
        super.onStart()
        lifeCycleLog("[DetailActivity]onStart()")
    }

    override fun onResume() {
        super.onResume()
        lifeCycleLog("[DetailActivity]onResume()")
    }

    override fun onPause() {
        super.onPause()
        lifeCycleLog("[DetailActivity]onPause()")
    }

    override fun onStop() {
        super.onStop()
        lifeCycleLog("[DetailActivity]onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        lifeCycleLog("[DetailActivity]onDestroy()")
    }
}
