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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.myapplication.BanderaSuiza
import androidx.compose.ui.graphics.Path

@Composable
fun BanderaTurquia(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxWidth().aspectRatio(1.5f)) {
        val w = size.width
        val h = size.height

        drawRect(color = Color.Red)

        drawCircle(color = Color.White,
                   radius = 150f,
                   center = Offset(330f, 350f))

        drawCircle(color = Color.Red,
                   radius = 120f,
                   center = Offset(370f, 350f))

        val estrella = Path()

        estrella.moveTo(500f, 250f)
        estrella.lineTo(515f, 290f)
        estrella.lineTo(560f, 290f)
        estrella.lineTo(525f, 315f)
        estrella.lineTo(540f, 360f)
        estrella.lineTo(500f, 335f)
        estrella.lineTo(460f, 360f)
        estrella.lineTo(475f, 315f)
        estrella.lineTo(440f, 290f)
        estrella.lineTo(485f, 290f)
        estrella.close()

        drawPath(
            path = estrella,
            color = Color.White
        )

    }
}


@Preview(showBackground = true)
@Composable
fun BanderaPreview()
{
    BanderaTurquia(modifier= Modifier.fillMaxSize())
}
