package com.example.myapplication

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun BanderaMexico(modifier: Modifier = Modifier) {

    ConstraintLayout(modifier = modifier) {

        val (verde, blanco, rojo, sello) = createRefs()

        val lineaGuia1 = createGuidelineFromStart(0.33f)
        val lineaGuia2 = createGuidelineFromStart(0.66f)

        // Verde
        Box(
            modifier = Modifier
                .background(Color(0xFF006847))
                .constrainAs(verde) {
                    start.linkTo(parent.start)
                    end.linkTo(lineaGuia1)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        // Blanco
        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(blanco) {
                    start.linkTo(lineaGuia1)
                    end.linkTo(lineaGuia2)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        // Rojo
        Box(
            modifier = Modifier
                .background(Color(0xFFCE1126))
                .constrainAs(rojo) {
                    start.linkTo(lineaGuia2)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        // Sello
        Canvas(
            modifier = Modifier
                .size(100.dp)
                .constrainAs(sello) {
                    start.linkTo(lineaGuia1)
                    end.linkTo(lineaGuia2)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
        ) {
            drawCircle(
                color = Color(0xFF006847),
                radius = size.minDimension / 2
            )

            drawCircle(
                color = Color.White,
                radius = size.minDimension / 2.7f
            )

            drawCircle(
                color = Color(0xFFCE1126),
                radius = size.minDimension / 5
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaPreview() {
    BanderaMexico(
        modifier = Modifier.fillMaxSize()
    )
}