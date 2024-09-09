package com.rafambn.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EmailMark: ImageVector
    get() {
        if (_emailMark != null) {
            return _emailMark!!
        }
        _emailMark = Builder(
            name = "EmailMark",
            defaultWidth = 75.294.dp,
            defaultHeight = 75.294.dp,
            viewportWidth = 75.294f,
            viewportHeight = 75.294f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF24292F)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(66.097f, 12.089f)
                horizontalLineToRelative(-56.9f)
                curveTo(4.126f, 12.089f, 0.0f, 16.215f, 0.0f, 21.286f)
                verticalLineToRelative(32.722f)
                curveToRelative(0.0f, 5.071f, 4.126f, 9.197f, 9.197f, 9.197f)
                horizontalLineToRelative(56.9f)
                curveToRelative(5.071f, 0.0f, 9.197f, -4.126f, 9.197f, -9.197f)
                verticalLineTo(21.287f)
                curveTo(75.295f, 16.215f, 71.169f, 12.089f, 66.097f, 12.089f)
                close()
                moveTo(61.603f, 18.089f)
                lineTo(37.647f, 33.523f)
                lineTo(13.691f, 18.089f)
                horizontalLineTo(61.603f)
                close()
                moveTo(66.097f, 57.206f)
                horizontalLineToRelative(-56.9f)
                curveTo(7.434f, 57.206f, 6.0f, 55.771f, 6.0f, 54.009f)
                verticalLineTo(21.457f)
                lineToRelative(29.796f, 19.16f)
                curveToRelative(0.04f, 0.025f, 0.083f, 0.042f, 0.124f, 0.065f)
                curveToRelative(0.043f, 0.024f, 0.087f, 0.047f, 0.131f, 0.069f)
                curveToRelative(0.231f, 0.119f, 0.469f, 0.215f, 0.712f, 0.278f)
                curveToRelative(0.025f, 0.007f, 0.05f, 0.01f, 0.075f, 0.016f)
                curveToRelative(0.267f, 0.063f, 0.537f, 0.102f, 0.807f, 0.102f)
                curveToRelative(0.001f, 0.0f, 0.002f, 0.0f, 0.002f, 0.0f)
                curveToRelative(0.002f, 0.0f, 0.003f, 0.0f, 0.004f, 0.0f)
                curveToRelative(0.27f, 0.0f, 0.54f, -0.038f, 0.807f, -0.102f)
                curveToRelative(0.025f, -0.006f, 0.05f, -0.009f, 0.075f, -0.016f)
                curveToRelative(0.243f, -0.063f, 0.48f, -0.159f, 0.712f, -0.278f)
                curveToRelative(0.044f, -0.022f, 0.088f, -0.045f, 0.131f, -0.069f)
                curveToRelative(0.041f, -0.023f, 0.084f, -0.04f, 0.124f, -0.065f)
                lineToRelative(29.796f, -19.16f)
                verticalLineToRelative(32.551f)
                curveTo(69.295f, 55.771f, 67.86f, 57.206f, 66.097f, 57.206f)
                close()
            }
        }
            .build()
        return _emailMark!!
    }

private var _emailMark: ImageVector? = null