package com.gaurav.bottomnavigationbar

sealed class BottomNavigationItem(var route: String, var icon: Int, var title: String) {
    object One : BottomNavigationItem("one", android.R.drawable.ic_menu_upload, "One")
    object Two : BottomNavigationItem("two", android.R.drawable.ic_menu_upload, "Two")
    object Three : BottomNavigationItem("three", android.R.drawable.ic_menu_upload, "Three")
    object Four : BottomNavigationItem("four", android.R.drawable.ic_menu_upload, "Four")
    object Five : BottomNavigationItem("five", android.R.drawable.ic_menu_upload, "Five")
}
