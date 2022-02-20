package com.anushka.didemo

import dagger.Component


/**
 * Created by Rajesh Kumar on 19-02-2022.
 * Copyright (c) 2022 Mantra Labs Pvt..
 */
@Component(modules = [MemoryCardModule::class, BatteryModule::class])
interface SmartphoneComponent {
    //fun getSmartPhone() : SmartPhone
    fun inject(mainActivity: MainActivity)
}