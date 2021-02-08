package com.android.androidcoroutinedemokotlin.models

data class RecyclerList(val items: ArrayList<RecyclerData>)
data class RecyclerData(val name : String, val description: String, val owner: Owner)
data class Owner(val avatar_url: String)