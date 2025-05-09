package com.sonifadhilah0132.moproassessment2.ui.screen

import androidx.lifecycle.ViewModel
import com.sonifadhilah0132.moproassessment2.model.Hutang

class MainViewModel: ViewModel() {

    val data = listOf(
        Hutang(
            1,
            "Evan",
            "Bayar kopi",
            20000,
            "2025-05-07"
        ),
        Hutang(
            2,
            "Akmal",
            "Bayar ramen",
            40000,
            "2025-05-07"
        ),
        Hutang(
            3,
            "Evan",
            "Bayar komik",
            45000,
            "2025-05-07"
        ),
        Hutang(
            4,
            "Rahman",
            "Bayar steam",
            20000,
            "2025-05-07"
        ),
        Hutang(
            5,
            "Rais",
            "Bayar kopi",
            10000,
            "2025-05-07"
        ),
    )

    fun getHutang(id: Long): Hutang? {
        return data.find { it.id == id }
    }
}