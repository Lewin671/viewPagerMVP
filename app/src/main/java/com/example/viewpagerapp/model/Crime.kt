package com.example.viewpagerapp.model

import java.util.*

class Crime(
    private val mTitle: String,
    private val mId: Int,
    private val mDate: Date,
    private val mIsSolved: Boolean
) {
    override fun toString(): String {
        return "Crime(mTitle='$mTitle', mId=$mId, mDate=$mDate, mIsSolved=$mIsSolved)"
    }

}