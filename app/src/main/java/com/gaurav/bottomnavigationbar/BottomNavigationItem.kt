package com.gaurav.bottomnavigationbar

sealed class BottomNavigationItem(var route: String, var icon: Int, var title: String) {
    object One : BottomNavigationItem("one", android.R.drawable.ic_media_play, "One")
    object Two : BottomNavigationItem("two", android.R.drawable.ic_media_play, "Two")
    object Three : BottomNavigationItem("three", android.R.drawable.ic_media_play, "Three")
    object Four : BottomNavigationItem("four", android.R.drawable.ic_media_play, "Four")
    object Five : BottomNavigationItem("five", android.R.drawable.ic_media_play, "Five")
}
