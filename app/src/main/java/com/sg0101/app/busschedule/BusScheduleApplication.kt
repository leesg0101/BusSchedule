package com.sg0101.app.busschedule

import android.app.Application
import com.sg0101.app.busschedule.database.AppDatabase

class BusScheduleApplication : Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}