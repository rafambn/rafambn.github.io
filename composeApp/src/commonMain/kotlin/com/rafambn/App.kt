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
import com.rafambn.icons.Banner
import com.rafambn.icons.EmailMark
import com.rafambn.icons.GithubMark
import com.rafambn.icons.LinkedlnMark
import com.rafambn.theme.PageTheme
import my_web_page.composeapp.generated.resources.Res
import my_web_page.composeapp.generated.resources.brazil_flag
import org.jetbrains.compose.resources.imageResource

@Composable
fun App(windowSizeDp: DpSize) = PageTheme {
    Box(
        Modifier.fillMaxSize().background(color = Color(66, 135, 245))
    ) {
        Image(
            imageResource(Res.drawable.brazil_flag),
            contentDescription = "balloon",
            modifier = Modifier.align(BiasAlignment(0f, -0.6F))
                .size(windowSizeDp.height * 3 / 10)
        )
        SimpleBalloon(
            GithubMark,
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
        SimpleBalloon(
            LinkedlnMark,
            "https://www.linkedin.com/in/rafambn/",
            windowSizeDp.height * 1 / 10,
            Modifier.align(
                OffsetAlignment { _, space, _ ->
                    IntOffset((space.width / 2 - space.height * 3 / 20 - space.height * 68 / 1000) / 3, space.height / 10)
                }
            )
        )
        SimpleBalloon(
            EmailMark,
            "mailto:rafambn@gmail.com",
            windowSizeDp.height * 1 / 10,
            Modifier.align(
                OffsetAlignment { _, space, _ ->
                    IntOffset((space.width / 2 - space.height * 3 / 20 - space.height * 68 / 1000) * 2 / 3, space.height * 3 / 10)
                }
            )
        )
        Image(
            imageVector = Banner,
            contentDescription = "balloon",
            modifier = Modifier.align(BiasAlignment(0F, 0F)).size(windowSizeDp.height * 7 / 20)
        )
        ComplexBalloon(
            null,
            "https://github.com/rafambn/KMaP",
            windowSizeDp.height * 2 / 10,
            Color.Cyan,
            Color.Blue,
            modifier = Modifier.align(BiasAlignment(0F, 0.6F)).size(windowSizeDp.height * 7 / 20)
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