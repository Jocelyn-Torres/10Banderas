package com.example.myapplication


import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale

@Composable
fun BanderaMexico(modifier: Modifier = Modifier) {

    ConstraintLayout(modifier = modifier){
        val (caja,caja1,caja2, escudo) = createRefs()

        val lineguia1 = createGuidelineFromStart(0.33f)
        val lineguia2 = createGuidelineFromStart(0.66f)



        Box(modifier = Modifier.background(Color.Red).constrainAs(caja){
            start.linkTo(parent.start)
            end.linkTo(lineguia1)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
           // verticalBias = 0.5f
           // horizontalBias = 0.5f
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        }  )

        Box(modifier = Modifier.background(Color.White).constrainAs(caja1){
            start.linkTo(lineguia2)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Box(modifier = Modifier.background(Color.Green).constrainAs(caja2){
            start.linkTo(lineguia2)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Image(
            painter = painterResource(id = R.drawable.escudo),
            contentDescription = "Escudo de MEXICO",
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(100.dp).constrainAs(escudo){
                start.linkTo(lineguia1)
                end.linkTo(lineguia2)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
            }
        )
    }
}


    @Preview(showBackground = true)
    @Composable
    fun BanderaPreview()
    {
        BanderaMexico(modifier= Modifier.fillMaxSize())
    }

