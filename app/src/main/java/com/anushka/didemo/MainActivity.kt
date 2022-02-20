package com.anushka.didemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var smartPhone: SmartPhone
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerSmartphoneComponent.builder()
            .memoryCardModule(MemoryCardModule(1000))
            .build()
        Log.e("MYTAG", "main activity")

        Log.e("MYTAG", "action 2 for commit")

//        DaggerSmartphoneComponent.create().inject(this)
//
//        smartPhone.makeACallWithRecording()
//        val smartPhone = SmartPhone(
//            Battery(),
//            SIMCard(ServiceProvider()),
//            MemoryCard()
//        ).makeACallWithRecording()


    }
}
