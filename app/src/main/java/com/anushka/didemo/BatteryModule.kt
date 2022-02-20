package com.anushka.didemo

import dagger.Module
import dagger.Provides


/**
 * Created by Rajesh Kumar on 19-02-2022.
 * Copyright (c) 2022 Mantra Labs Pvt..
 */
@Module
class BatteryModule {
    @Provides
    fun provideNBattery(nickleBattery: NickleBattery) : Battery{
        return nickleBattery
    }
}