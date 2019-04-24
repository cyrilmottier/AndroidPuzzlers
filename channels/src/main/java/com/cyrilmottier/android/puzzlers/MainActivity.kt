package com.cyrilmottier.android.puzzlers

import android.app.Activity
import android.app.NotificationChannel
import android.app.NotificationManager
import android.graphics.Color
import android.os.Bundle
import com.cyrilmottier.android.puzzlers.base.trace

private const val CHANNEL_ID = "channel"

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val manager = getSystemService(NotificationManager::class.java)

        val aChannel = NotificationChannel(
            CHANNEL_ID, // id
            "A name", // name
            NotificationManager.IMPORTANCE_DEFAULT // importance (3)
        )
        aChannel.lightColor = Color.RED

        manager.createNotificationChannel(aChannel)
        manager.deleteNotificationChannel(CHANNEL_ID)

        val anotherChannel = NotificationChannel(
            CHANNEL_ID, // id
            "Another name", // name
            NotificationManager.IMPORTANCE_HIGH // importance (4)
        )
        anotherChannel.lightColor = Color.GREEN

        manager.createNotificationChannel(anotherChannel)

        with(manager.getNotificationChannel(CHANNEL_ID)) {
            trace("$name, $importance, 0x${Integer.toHexString(lightColor)}")
        }
    }
}

// What will it trace?

// A: A name, 3, 0xffff0000
// B: Another name, 4, 0xff00ff00
// C: Another name, 3, 0xff00ff00
// D: Another name, 3, 0xffff0000
