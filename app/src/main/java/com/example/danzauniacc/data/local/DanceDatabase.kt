package com.example.danzauniacc.data.local
import androidx.room.Database
import androidx.room.RoomDatabase
@Database(entities=[RetroalimentacionEntity::class],version=1,exportSchema=false) abstract class DanceDatabase:RoomDatabase(){ abstract fun estudianteDao():EstudianteDao }
