package com.rafambn

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import com.rafambn.icons.SimpleBalloonVec
import com.rafambn.icons.getBalloon

@Composable
fun SimpleBalloon(balloonMarker: ImageVector, url: String, height: Dp, modifier: Modifier) {
    val uriHandler = LocalUriHandler.current
    Box(
        modifier
            .size(DpSize(height * 68 / 100, height))
            .clickable { uriHandler.openUri(url) }
    ) {
        Image(
            imageVector = SimpleBalloonVec,
            contentDescription = "balloon",
            modifier = Modifier.align(Alignment.Center)
        )
        Image(
            imageVector = balloonMarker,
            contentDescription = "marker",
            modifier = Modifier.size(height * 4 / 10).align(BiasAlignment(0f, -0.5f))
        )
    }
}

@Composable
fun ComplexBalloon(balloonMarker: ImageVector?, url: String, height: Dp, color1: Color, color2: Color, modifier: Modifier) {
    val uriHandler = LocalUriHandler.current
    val imageVector = remember { getBalloon(color1, color2) }
    Box(
        modifier
            .size(DpSize(height * 153 / 217, height))
            .clickable { uriHandler.openUri(url) }
    ) {
        Image(
            imageVector = imageVector,
            contentDescription = "complexBalloon",
            modifier = Modifier.align(Alignment.Center)
        )
//        Image(
//            imageVector = balloonMarker,
//            contentDescription = "marker",
//            modifier = Modifier.size(height * 4 / 10).align(BiasAlignment(0f, -0.5f))
//        )
    }
}