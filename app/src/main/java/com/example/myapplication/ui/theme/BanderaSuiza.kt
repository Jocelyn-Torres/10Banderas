package com.example.myapplication


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
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension


@Composable
fun BanderaSuiza(modifier: Modifier = Modifier) {

    ConstraintLayout(modifier = modifier) {

        val (fondo, rec, rec2) = createRefs()

        Box(modifier = Modifier.background(Color.Red).constrainAs(fondo){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color.White).constrainAs(rec){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            width = Dimension.value(80.dp)
            height = Dimension.percent(0.400f)
        })

        Box(modifier = Modifier.background(Color.White).constrainAs(rec2){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            width = Dimension.percent(0.66f)
            height = Dimension.value(80.dp)
        })
    }
}


@Preview(showBackground = true)
@Composable
fun BanderaPreview()
{
    BanderaSuiza(modifier= Modifier.fillMaxSize())
}
