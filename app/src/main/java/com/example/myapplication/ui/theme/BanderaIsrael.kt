package com.example.myapplication

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun BanderaIsrael(modifier: Modifier = Modifier) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        Canvas(
            modifier = Modifier.fillMaxSize()
        ) {

            val azul = Color(0xFF0038B8)

            val franjaAltura = size.height * 0.18f

            drawRect(
                color = azul,
                topLeft = Offset(
                    0f,
                    size.height * 0.12f
                ),
                size = androidx.compose.ui.geometry.Size(
                    size.width,
                    franjaAltura
                )
            )

            drawRect(
                color = azul,
                topLeft = Offset(
                    0f,
                    size.height * 0.70f
                ),
                size = androidx.compose.ui.geometry.Size(
                    size.width,
                    franjaAltura
                )
            )

            // Centro del hexagrama
            val cx = size.width / 2f
            val cy = size.height / 2f
            val radio = size.width * 0.20f

            val trianguloArriba = Path()

            for (i in 0..2) {

                val angulo = Math.toRadians(
                    (-90 + i * 120).toDouble()
                )

                val x = cx + radio * cos(angulo).toFloat()
                val y = cy + radio * sin(angulo).toFloat()

                if (i == 0) {
                    trianguloArriba.moveTo(x, y)
                } else {
                    trianguloArriba.lineTo(x, y)
                }
            }

            trianguloArriba.close()

            val trianguloAbajo = Path()

            for (i in 0..2) {

                val angulo = Math.toRadians(
                    (90 + i * 120).toDouble()
                )

                val x = cx + radio * cos(angulo).toFloat()
                val y = cy + radio * sin(angulo).toFloat()

                if (i == 0) {
                    trianguloAbajo.moveTo(x, y)
                } else {
                    trianguloAbajo.lineTo(x, y)
                }
            }

            trianguloAbajo.close()

            drawPath(
                path = trianguloArriba,
                color = azul,
                style = Stroke(width = 8f)
            )

            drawPath(
                path = trianguloAbajo,
                color = azul,
                style = Stroke(width = 8f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaIsraelPreview() {
    BanderaIsrael(
        modifier = Modifier.fillMaxSize()
    )
}