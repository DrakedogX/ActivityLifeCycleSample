package com.example.juntest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LifeCycleLog("[DetailActivity]onCreate()")
        setContentView(R.layout.activity_detail)
    }

    override fun onStart() {
        super.onStart()
        LifeCycleLog("[DetailActivity]onStart()")
    }

    override fun onResume() {
        super.onResume()
        LifeCycleLog("[DetailActivity]onResume()")
    }

    override fun onPause() {
        super.onPause()
        LifeCycleLog("[DetailActivity]onPause()")
    }

    override fun onStop() {
        super.onStop()
        LifeCycleLog("[DetailActivity]onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        LifeCycleLog("[DetailActivity]onDestroy()")
    }
}
