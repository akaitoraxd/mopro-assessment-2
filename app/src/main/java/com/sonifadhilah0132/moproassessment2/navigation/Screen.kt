package com.sonifadhilah0132.moproassessment2.navigation

import com.sonifadhilah0132.moproassessment2.ui.screen.KEY_ID_HUTANG

sealed class Screen(val route: String){
    data object Home: Screen("mainScreen")
    data object FormBaru: Screen("detailScreen")
    data object FormEdit: Screen("detailScreen/{$KEY_ID_HUTANG}") {
        fun withId(id: Long) = "detailScreen/$id"
    }
}