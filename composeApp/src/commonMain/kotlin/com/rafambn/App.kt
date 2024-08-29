package com.rafambn

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import com.rafambn.theme.PageTheme
import my_web_page.composeapp.generated.resources.Res
import my_web_page.composeapp.generated.resources.airplane_banner
import my_web_page.composeapp.generated.resources.brazil_flag
import my_web_page.composeapp.generated.resources.email_mark
import my_web_page.composeapp.generated.resources.github_mark
import my_web_page.composeapp.generated.resources.linkedln_mark
import my_web_page.composeapp.generated.resources.plane
import org.jetbrains.compose.resources.imageResource
import org.jetbrains.compose.resources.vectorResource

@Composable
fun App(windowSizeDp: DpSize) = PageTheme {
    Box(
        Modifier.fillMaxSize().background(color = Color(66, 135, 245))
    ) {
        Image(
            imageResource(Res.drawable.brazil_flag),
            contentDescription = "balloon",
            modifier = Modifier.align(BiasAlignment(0f, -0.8f))
                .size(windowSizeDp.height * 3 / 10)
        )
        Balloon(
            vectorResource(Res.drawable.github_mark),
            "https://github.com/rafambn",
            windowSizeDp.height * 1 / 10,
            Modifier.align(
                OffsetAlignment { _, space, _ ->
                    IntOffset(
                        (space.width / 2 - space.height * 3 / 20 - space.height * 68 / 1000) / 2 + space.width / 2 + space.height * 3 / 20,
                        space.height * 5 / 20)
                }
            )
        )
        Balloon(
            vectorResource(Res.drawable.linkedln_mark),
            "https://www.linkedin.com/in/rafambn/",
            windowSizeDp.height * 1 / 10,
            Modifier.align(
                OffsetAlignment { _, space, _ ->
                    IntOffset((space.width / 2 - space.height * 3 / 20 - space.height * 68 / 1000) / 3, space.height / 10)
                }
            )
        )
        Balloon(
            vectorResource(Res.drawable.email_mark),
            "mailto:rafambn@gmail.com",
            windowSizeDp.height * 1 / 10,
            Modifier.align(
                OffsetAlignment { _, space, _ ->
                    IntOffset((space.width / 2 - space.height * 3 / 20 - space.height * 68 / 1000) * 2 / 3, space.height * 3 / 10)
                }
            )
        )
        Image(
            imageVector = vectorResource(Res.drawable.airplane_banner),
            contentDescription = "balloon",
            modifier = Modifier.align(BiasAlignment(0F, -0.2F)).size(windowSizeDp.height * 7 / 20)
        )
        Image(
            imageVector = vectorResource(Res.drawable.plane),
            contentDescription = "balloon",
            modifier = Modifier
                .align(
                    OffsetAlignment { _, space, _ ->
                        IntOffset(space.width / 2 + (space.height * 7 / 20) / 2 - (space.height * 1 / 100), space.height * 39 / 100)
                    }
                )
                .size(windowSizeDp.height * 1 / 10)
        )
    }
}

@Immutable
data class OffsetAlignment(
    val lambda: (size: IntSize, space: IntSize, layoutDirection: LayoutDirection) -> IntOffset
) : Alignment {
    override fun align(
        size: IntSize,
        space: IntSize,
        layoutDirection: LayoutDirection
    ): IntOffset {
        return lambda(size, space, layoutDirection)
    }
}