
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension


@Composable
fun BanderaBrasil(modifier : Modifier = Modifier) {
    ConstraintLayout(modifier = modifier)
    {
        val (fondo) = createRefs()

        Box(modifier = Modifier.background(Color(0xFF009739)).constrainAs(fondo) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        Canvas(
            modifier = Modifier.fillMaxSize()
        ) {
            val centroX = size.width / 2
            val centroY = size.height / 2

            drawLine(
                color = Color.Red,
                start = Offset(0f, centroY),
                end = Offset(size.width, centroY)
            )

            drawLine(
                color = Color.Red,
                start = Offset(centroX, 0f),
                end = Offset(centroX, size.height)
            )
            val rombo = Path().apply {
                moveTo(centroX, 50f)
                lineTo(size.width - 50f, centroY)
                lineTo(centroX, size.height - 50f)
                lineTo(50f, centroY)
                close()
            }

            drawPath(
                path = rombo,
                color = Color.Yellow
            )

            drawCircle(
                color = Color(0xFF002776),
                radius = 400f,
                center = Offset(centroX, centroY)
            )
        }





    }
}

@Preview(showBackground = true)
@Composable
fun BanderaBrasil()
{
    BanderaBrasil(modifier= Modifier.fillMaxSize())
}