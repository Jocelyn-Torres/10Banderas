package com.example.myapplication

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color

@Composable
fun BanderaJapon() {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        drawRect(
            color = Color.White,
            size = size
        )

        drawCircle(
            color = Color.Red,
            radius = size.height / 4,
            center = Offset(
                x = size.width / 2,
                y = size.height / 2
            )
        )
    }
}