package com.example.myapplication

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color

@Composable
fun BanderaEstadosUnidos() {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        val ancho = size.width
        val alto = size.height

        val altoFranja = alto / 13

        for (i in 0 until 13) {
            drawRect(
                color = if (i % 2 == 0) Color.Red else Color.White,
                topLeft = Offset(0f, i * altoFranja),
                size = Size(ancho, altoFranja)
            )
        }

        drawRect(
            color = Color(0xFF000080),
            size = Size(
                ancho * 0.4f,
                alto * 0.54f
            )
        )

        val filas = 5
        val columnas = 6

        for (fila in 0 until filas) {
            for (columna in 0 until columnas) {
                drawCircle(
                    color = Color.White,
                    radius = 4f,
                    center = Offset(
                        ancho * 0.4f * (0.12f + columna * 0.15f),
                        alto * 0.54f * (0.10f + fila * 0.20f)
                    )
                )
            }
        }
    }
}