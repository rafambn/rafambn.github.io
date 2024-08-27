package com.rafambn

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import my_web_page.composeapp.generated.resources.Res
import my_web_page.composeapp.generated.resources.hot_air_balloon
import my_web_page.composeapp.generated.resources.open_github
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.resources.vectorResource

@Composable
fun Balloon(balloonMarker: ImageVector, url: String, height: Dp, modifier: Modifier) {
    val uriHandler = LocalUriHandler.current
    Box(
        modifier
            .size(DpSize(height * 68 / 100, height))
            .clickable { uriHandler.openUri(url) }
    ) {
        Image(
            imageVector = vectorResource(Res.drawable.hot_air_balloon),
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