package com.example.cardandimages_osmanbarahona_imagencoil.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

val InstagramPrimary = Color(0xFF000000)
val InstagramSecondary = Color(0xFFFFFFFF)
val InstagramAccent = Color(0xFFE1306C)
val InstagramGray = Color(0xFFBDBDBD)

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun CardAndImages_OsmanBarahona_ImagenCoilTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = MaterialTheme.colorScheme.copy(
            primary = InstagramPrimary,
            onPrimary = InstagramSecondary,
            secondary = InstagramAccent,
            background = Color.White,
            surface = InstagramSecondary,
            onBackground = InstagramPrimary
        ),
        typography = Typography,
        content = content
    )
}