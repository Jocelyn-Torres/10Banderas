package com.example.myapplication.components

import android.R.attr.start
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.Dimension


@Composable
fun LogoRusia(modifier: Modifier){


    val (circ1, circ2, estrellaref) =
    Box(modifier = Modifier.background(Color.White, CircleShape).constrainAs(circ1){
        start.linkTo(parent.start)
        top.linkTo(parent.top)
        bottom.linkTo(parent.bottom)
        width = Dimension.value(200.dp)
        height = Dimension.value(200.dp)
    })

    Box(modifier = Modifier.background(Color.Red, CircleShape).constrainAs(circ2){
        start.linkTo(parent.start)
        end.linkTo(parent.end)
        top.linkTo(parent.top)
        bottom.linkTo(parent.bottom)
        width = Dimension.value(150.dp)
        height = Dimension.value(150.dp)
        horizontalBias=0.22f
    })

    Canvas(modifier = modifier
        .constrainAs(estrellaref){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            width = Dimension.value(100.dp)
            height = Dimension.value(100.dp)
            horizontalBias=0.23f

        }) {

        val moverX = size.width / 2
        val moverY = size.height / 2

        val estrella = Path().apply {
            // Coordenadas corregidas restando el desfase original (590 en X, 365 en Y)
            moveTo(moverX + 10f, moverY - 65f)
            lineTo(moverX + 20f, moverY - 25f)
            lineTo(moverX + 60f, moverY - 25f)
            lineTo(moverX + 35f, moverY + 0f)
            lineTo(moverX + 35f, moverY + 45f)
            lineTo(moverX + 0f, moverY + 20f)
            lineTo(moverX - 40f, moverY + 45f)
            lineTo(moverX - 25f, moverY + 0f)
            lineTo(moverX - 60f, moverY - 25f)
            lineTo(moverX - 15f, moverY - 25f)
            close() // Cierra la figura volviendo al punto inicial automáticamente
        }

        drawPath(
            path = estrella,
            color = Color.White
        )
    }


}