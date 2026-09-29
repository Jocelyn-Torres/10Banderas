package com.example.myapplication

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun BanderaColombia(modifier: Modifier = Modifier) {

    ConstraintLayout(modifier = modifier) {
        val (caja, caja1, caja2) = createRefs()

        val lineguia1 = createGuidelineFromTop(0.5f)
        val lineguia2 = createGuidelineFromTop(0.75f)

        Box(modifier = Modifier.background(Color.Yellow).constrainAs(caja){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(lineguia1)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })


        Box(modifier = Modifier.background(Color.Blue).constrainAs(caja1){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(lineguia1)
            bottom.linkTo(lineguia2)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })


        Box(modifier = Modifier.background(Color.Red).constrainAs(caja2){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(lineguia2)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
    }

    }
