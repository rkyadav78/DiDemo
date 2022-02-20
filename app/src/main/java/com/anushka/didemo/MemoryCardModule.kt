package com.anushka.didemo

import android.util.Log
import dagger.Module
import dagger.Provides


/**
 * Created by Rajesh Kumar on 19-02-2022.
 * Copyright (c) 2022 Mantra Labs Pvt..
 */
@Module
class MemoryCardModule(val memorySize : Int) {

    @Provides
    fun provideMemoryCard(): MemoryCard{
        Log.i("MYTAG","size of the memory is $memorySize")
        return MemoryCard()
    }

}