package com.sonifadhilah0132.moproassessment2.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sonifadhilah0132.moproassessment2.database.HutangDao
import com.sonifadhilah0132.moproassessment2.model.Hutang
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class DetailViewModel(private val dao: HutangDao): ViewModel() {

    private val formatter = SimpleDateFormat("yyyy-MM-dd", Locale.US)

    fun insert(target: String, catatan: String, total: Long) {
        val hutang = Hutang(
            tanggal = formatter.format(Date()),
            target = target,
            catatan = catatan,
            totalHutang = total
        )

        viewModelScope.launch(Dispatchers.IO) {
            dao.insert(hutang)
        }
    }

    fun getHutang(id: Long): Hutang? {
        return null
    }
}