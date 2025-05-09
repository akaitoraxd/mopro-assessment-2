package com.sonifadhilah0132.moproassessment2.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "hutang")
data class Hutang(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val target: String,
    val catatan: String,
    val totalHutang: Long,
    val tanggal: String
)
