package com.sonifadhilah0132.moproassessment2.util

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sonifadhilah0132.moproassessment2.database.HutangDb
import com.sonifadhilah0132.moproassessment2.ui.screen.MainViewModel

class ViewModelFactory(
    private val context: Context
): ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val dao = HutangDb.getInstance(context).dao
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(dao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}