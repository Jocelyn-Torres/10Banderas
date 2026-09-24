package com.example.myapplication

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color

@Composable
fun BanderaArgentina() {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        val ancho = size.width
        val alto = size.height
        val franja = alto / 3

        drawRect(
            color = Color(0xFF74ACDF),
            size = Size(ancho, franja)
        )

        drawRect(
            color = Color.White,
            topLeft = androidx.compose.ui.geometry.Offset(0f, franja),
            size = Size(ancho, franja)
        )

        drawRect(
            color = Color(0xFF74ACDF),
            topLeft = androidx.compose.ui.geometry.Offset(0f, franja * 2),
            size = Size(ancho, franja)
        )

        drawCircle(
            color = Color(0xFFFFD700),
            radius = alto * 0.08f,
            center = androidx.compose.ui.geometry.Offset(
                ancho / 2,
                alto / 2
            )
        )
    }
}
