package com.sonifadhilah0132.moproassessment2.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.sonifadhilah0132.moproassessment2.model.Hutang
import kotlinx.coroutines.flow.Flow

@Dao
interface HutangDao {

    @Insert
    suspend fun insert(hutang: Hutang)

    @Update
    suspend fun update(hutang: Hutang)

    @Query("SELECT * FROM hutang ORDER BY tanggal DESC")
    fun getHutang(): Flow<List<Hutang>>

    @Query("SELECT * FROM hutang WHERE id = :id")
    suspend fun getHutangById(id: Long): Hutang?

    @Query("DELETE FROM hutang WHERE id = :id")
    suspend fun  deleteById(id: Long)

}