package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun BanderaUSA(
    modifier: Modifier = Modifier,
) {

    ConstraintLayout(modifier = modifier) {

        val (franjas, azul, estrellas) = createRefs()

        Column(
            modifier = Modifier
                .constrainAs(franjas) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)

                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                }
        ) {

            repeat(13) { i ->

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .background(
                            if (i % 2 == 0) {
                                Color.Red
                            } else {
                                Color.White
                            }
                        )
                )
            }
        }

        Box(
            modifier = Modifier
                .background(Color.Blue)
                .constrainAs(azul) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)

                    width = Dimension.percent(0.50f)
                    height = Dimension.percent(0.50f)
                }
        )

        Column(
            modifier = Modifier
                .constrainAs(estrellas) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)

                    width = Dimension.percent(0.50f)
                    height = Dimension.percent(0.50f)
                },
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            repeat(8) {

                Row(
                    modifier = Modifier.fillMaxSize().weight(1f),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    repeat(6) {

                        Text(
                            text = "★",
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BanderaUSAPreview() {

    BanderaUSA(
        modifier = Modifier
            .size(width = 300.dp,
                height = 200.dp
            )
    )
}