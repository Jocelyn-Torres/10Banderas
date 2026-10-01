package com.example.myapplication.ui.theme

import android.R
import androidx.compose.foundation.Canvas
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.compose.ui.graphics.Path

@Composable
fun BanderaTurquia(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {

        val(fondo, circ1, circ2, estrellaref) = createRefs()

        Box(modifier = Modifier.background(Color.Red).constrainAs(fondo){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color.White, CircleShape).constrainAs(circ1){
            start.linkTo(parent.start, margin = 110.dp)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom, margin = 400.dp)
            width = Dimension.value(200.dp)
            height = Dimension.value(200.dp)
        })

        Box(modifier = Modifier.background(Color.Red, CircleShape).constrainAs(circ2){
            start.linkTo(parent.start, margin = 130.dp)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom, margin = 330.dp)
            width = Dimension.value(150.dp)
            height = Dimension.value(150.dp)
        })

        Canvas(modifier = modifier.constrainAs(estrellaref){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        }) {

            val moverX = -50f
            val moverY = 400f

            val estrella = Path()

            estrella.moveTo(600f + moverX, 300f + moverY)
            estrella.lineTo(610f + moverX, 340f + moverY)
            estrella.lineTo(650f + moverX, 340f + moverY)
            estrella.lineTo(625f + moverX, 365f + moverY)
            estrella.lineTo(625f + moverX, 410f + moverY)
            estrella.lineTo(590f + moverX, 385f + moverY)
            estrella.lineTo(550f + moverX, 410f + moverY)
            estrella.lineTo(565f + moverX, 365f + moverY)
            estrella.lineTo(530f + moverX, 340f + moverY)
            estrella.lineTo(575f + moverX, 340f + moverY)

            estrella.close()

            drawPath(
                path = estrella,
                color = Color.White
            )
        }
    }

    }



@Preview(showBackground = true)
@Composable
fun BanderaPreview()
{
    BanderaTurquia(modifier= Modifier.fillMaxSize())
}
