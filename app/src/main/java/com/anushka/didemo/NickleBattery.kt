package com.anushka.didemo

import android.util.Log
import javax.inject.Inject


/**
 * Created by Rajesh Kumar on 19-02-2022.
 * Copyright (c) 2022 Mantra Labs Pvt..
 */
class NickleBattery @Inject constructor(): Battery{
    override fun getPower() {
        Log.i("MYTAG", "POWER FROM Nicklebattery")
    }
}