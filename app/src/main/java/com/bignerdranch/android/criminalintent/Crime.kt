package com.bignerdranch.android.criminalintent

import java.util.*

data class Crime(
    val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var data: Date = Date(),
    var isSolved: Boolean = false
)
