package com.sonifadhilah0132.moproassessment2.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sonifadhilah0132.moproassessment2.database.HutangDao
import com.sonifadhilah0132.moproassessment2.model.Hutang
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class MainViewModel(dao: HutangDao): ViewModel() {

    val data: StateFlow<List<Hutang>> = dao.getHutang().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(),
        initialValue = emptyList()
    )

    fun getHutang(id: Long): Hutang? {
        return data.value.find { it.id == id }
    }
}