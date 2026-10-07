
package com.example.myapplication

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path

@Composable
fun BanderaBrasil() {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        val ancho = size.width
        val alto = size.height

        drawRect(
            color = Color(0xFF009B3A),
            size = size
        )

        val rombo = Path().apply {
            moveTo(ancho / 2, alto * 0.20f)
            lineTo(ancho * 0.90f, alto / 2)
            lineTo(ancho / 2, alto * 0.80f)
            lineTo(ancho * 0.10f, alto / 2)
            close()
        }

        drawPath(
            path = rombo,
            color = Color(0xFFFFDF00)
        )

        drawCircle(
            color = Color(0xFF002776),
            radius = alto * 0.18f,
            center = Offset(ancho / 2, alto / 2)
        )
    }
}