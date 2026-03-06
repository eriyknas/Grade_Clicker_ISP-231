package com.cheshuina_antonova.grade_clicker_isp_231.model

import androidx.annotation.DrawableRes

data class Grade(
    @DrawableRes val imageId: Int,
    val pointsPerClick: Int,
    val threshold: Int
)