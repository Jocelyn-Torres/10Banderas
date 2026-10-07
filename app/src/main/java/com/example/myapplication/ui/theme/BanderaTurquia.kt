package com.example.myapplication.ui.theme

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.myapplication.components.LogoRusia

@Composable
fun BanderaTurquia(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {

        val(fondo) = createRefs()

        Box(modifier = Modifier.background(Color.Red).constrainAs(fondo){
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        LogoRusia(modifier= Modifier)

    }

    }



@Preview(showBackground = true)
@Composable
fun BanderaPreview()
{
    BanderaTurquia(modifier= Modifier.fillMaxSize())
}
