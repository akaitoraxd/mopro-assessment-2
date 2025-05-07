package com.sonifadhilah0132.moproassessment2.navigation

sealed class Screen(val route: String){
    data object Home: Screen("mainScreen")
}