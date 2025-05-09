package com.sonifadhilah0132.moproassessment2.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sonifadhilah0132.moproassessment2.model.Hutang

@Database(entities = [Hutang::class], version = 1, exportSchema = false)
abstract class HutangDb: RoomDatabase(){

    abstract val dao: HutangDao

    companion object {

        @Volatile
        private var INSTANCE: HutangDb? = null

        fun getInstance(context: Context): HutangDb {
            synchronized(this) {
                var instance = INSTANCE

                if(instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        HutangDb::class.java,
                        "hutang_db"
                    ).build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}