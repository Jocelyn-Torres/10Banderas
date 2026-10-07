package com.example.myapplication

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path

@Composable
fun BanderaCanada() {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        val ancho = size.width
        val alto = size.height

        drawRect(
            color = Color.Red,
            size = size
        )

        drawRect(
            color = Color.White,
            topLeft = Offset(ancho * 0.25f, 0f),
            size = androidx.compose.ui.geometry.Size(
                ancho * 0.50f,
                alto
            )
        )

        val hoja = Path().apply {
            moveTo(ancho * 0.50f, alto * 0.20f)
            lineTo(ancho * 0.54f, alto * 0.35f)
            lineTo(ancho * 0.62f, alto * 0.32f)
            lineTo(ancho * 0.57f, alto * 0.42f)
            lineTo(ancho * 0.64f, alto * 0.48f)
            lineTo(ancho * 0.55f, alto * 0.50f)
            lineTo(ancho * 0.57f, alto * 0.65f)
            lineTo(ancho * 0.50f, alto * 0.58f)
            lineTo(ancho * 0.43f, alto * 0.65f)
            lineTo(ancho * 0.45f, alto * 0.50f)
            lineTo(ancho * 0.36f, alto * 0.48f)
            lineTo(ancho * 0.43f, alto * 0.42f)
            lineTo(ancho * 0.38f, alto * 0.32f)
            lineTo(ancho * 0.46f, alto * 0.35f)
            close()
        }

        drawPath(
            path = hoja,
            color = Color.Red
        )
    }
}