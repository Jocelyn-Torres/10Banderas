package com.example.myapplication

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun BnaderaCanada(modifier: Modifier = Modifier) {

    ConstraintLayout(
        modifier = modifier
    ) {

        val (caja, caja1, caja2, hoja) = createRefs()

        val linea1 = createGuidelineFromStart(0.25f)
        val linea2 = createGuidelineFromStart(0.75f)

        Box(
            modifier = Modifier
                .background(Color.Red)
                .constrainAs(caja) {

                    start.linkTo(parent.start)
                    end.linkTo(linea1)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(Color.White)
                .constrainAs(caja1) {

                    start.linkTo(linea1)
                    end.linkTo(linea2)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Box(
            modifier = Modifier
                .background(Color.Red)
                .constrainAs(caja2) {

                    start.linkTo(linea2)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        )

        Canvas(
            modifier = Modifier
                .size(140.dp)
                .constrainAs(hoja) {

                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                }
        ) {

            val hojaPath = Path().apply {

                //Punta superior
                moveTo(size.width / 2, 0f)

                //Parte derecha superior
                lineTo(size.width * 0.58f, size.height * 0.22f)
                lineTo(size.width * 0.72f, size.height * 0.15f)
                lineTo(size.width * 0.67f, size.height * 0.32f)

                //Punta derecha
                lineTo(size.width * 0.90f, size.height * 0.28f)
                lineTo(size.width * 0.78f, size.height * 0.45f)
                lineTo(size.width, size.height * 0.50f)

                //Parte inferior derecha
                lineTo(size.width * 0.72f, size.height * 0.58f)
                lineTo(size.width * 0.80f, size.height * 0.75f)

                // Tallo
                lineTo(size.width * 0.55f, size.height * 0.70f)
                lineTo(size.width * 0.55f, size.height)

                lineTo(size.width * 0.45f, size.height)

                lineTo(size.width * 0.45f, size.height * 0.70f)

                // Parte inferior izquierda
                lineTo(size.width * 0.20f, size.height * 0.75f)
                lineTo(size.width * 0.28f, size.height * 0.58f)

                // Punta izquierda
                lineTo(0f, size.height * 0.50f)
                lineTo(size.width * 0.22f, size.height * 0.45f)
                lineTo(size.width * 0.10f, size.height * 0.28f)

                lineTo(size.width * 0.33f, size.height * 0.32f)
                lineTo(size.width * 0.28f, size.height * 0.15f)
                lineTo(size.width * 0.42f, size.height * 0.22f)

                close()
            }

            drawPath(
                path = hojaPath,
                color = Color.Red
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaCanadaPreview() {

    BnaderaCanada(
        modifier = Modifier
            .size(width = 300.dp, height = 200.dp)
    )
}
