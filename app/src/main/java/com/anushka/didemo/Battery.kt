package com.anushka.didemo

import android.util.Log
import javax.inject.Inject

interface Battery  {
    /*init {
        Log.i("MYTAG","Battery Constructed")
    }*/

    fun getPower()
}
