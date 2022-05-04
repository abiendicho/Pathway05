package com.example.pathway05

import android.os.Handler
import timber.log.Timber
import android.os.Looper

class DessertTimer {
    var secondsCount = 0

    private var handler = Handler(Looper.getMainLooper())
    private lateinit var runnable: Runnable


    fun startTimer() {
        runnable = Runnable {
            secondsCount++
            Timber.i("Timer is at : $secondsCount")
            handler.postDelayed(runnable, 1000)
        }
        handler.postDelayed(runnable, 1000)
    }

    fun stopTimer() {
        handler.removeCallbacks(runnable)
    }
}