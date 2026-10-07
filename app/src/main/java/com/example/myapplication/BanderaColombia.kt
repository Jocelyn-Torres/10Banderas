package com.example.myapplication

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color

@Composable
fun BanderaColombia() {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        val ancho = size.width
        val alto = size.height

        drawRect(
            color = Color.Yellow,
            size = Size(ancho, alto * 0.50f)
        )

        drawRect(
            color = Color.Blue,
            topLeft = androidx.compose.ui.geometry.Offset(0f, alto * 0.50f),
            size = Size(ancho, alto * 0.25f)
        )

        drawRect(
            color = Color.Red,
            topLeft = androidx.compose.ui.geometry.Offset(0f, alto * 0.75f),
            size = Size(ancho, alto * 0.25f)
        )
    }
}