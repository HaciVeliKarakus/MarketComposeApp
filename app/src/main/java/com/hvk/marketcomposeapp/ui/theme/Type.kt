package com.hvk.marketcomposeapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.hvk.marketcomposeapp.R

object AppFont {
    val myfont = FontFamily(
        Font(R.font.american_captain, FontWeight.Normal),
    )
}

private val defaultTypography = Typography()
val Typography = Typography(
    displayLarge = defaultTypography.displayLarge.copy(fontFamily = AppFont.myfont),
    displayMedium = defaultTypography.displayMedium.copy(fontFamily = AppFont.myfont),
    displaySmall = defaultTypography.displaySmall.copy(fontFamily = AppFont.myfont),

    headlineLarge = defaultTypography.headlineLarge.copy(fontFamily = AppFont.myfont),
    headlineMedium = defaultTypography.headlineMedium.copy(fontFamily = AppFont.myfont),
    headlineSmall = defaultTypography.headlineSmall.copy(fontFamily = AppFont.myfont),

    titleLarge = defaultTypography.titleLarge.copy(fontFamily = AppFont.myfont),
    titleMedium = defaultTypography.titleMedium.copy(fontFamily = AppFont.myfont),
    titleSmall = defaultTypography.titleSmall.copy(fontFamily = AppFont.myfont),

    bodyLarge = defaultTypography.bodyLarge.copy(fontFamily = AppFont.myfont),
    bodyMedium = defaultTypography.bodyMedium.copy(fontFamily = AppFont.myfont),
    bodySmall = defaultTypography.bodySmall.copy(fontFamily = AppFont.myfont),

    labelLarge = defaultTypography.labelLarge.copy(fontFamily = AppFont.myfont),
    labelMedium = defaultTypography.labelMedium.copy(fontFamily = AppFont.myfont),
    labelSmall = defaultTypography.labelSmall.copy(fontFamily = AppFont.myfont),
)
