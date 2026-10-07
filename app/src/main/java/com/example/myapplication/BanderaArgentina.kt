package com.example.myapplication

import android.R.attr.logo
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun BanderaArgentina(modifier: Modifier = Modifier) {

    ConstraintLayout(modifier = modifier) {
        val(izq, medio, der, logo) = createRefs()
        val lineaguia = createGuidelineFromStart(0.33f)
        val lineaguia2 = createGuidelineFromStart(0.66F)

        Box(modifier = Modifier.background(Color(0xFF74ACDF)).constrainAs(izq){
            start.linkTo(parent.start)
            end.linkTo(lineaguia)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color.White).constrainAs(medio){
            start.linkTo(lineaguia2)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color(0xFF74ACDF)).constrainAs(der){
            start.linkTo(lineaguia2)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

    Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "Logo de Argentina",
        contentScale = ContentScale.Fit,
        modifier = Modifier.size(100.dp).constrainAs(logo){
            start.linkTo(lineaguia)
            end.linkTo(lineaguia2)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
        }
    )
  }
}
    @Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaArgentina(modifier = Modifier.fillMaxSize())
    }

