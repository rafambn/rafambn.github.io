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

val LinkedlnMark: ImageVector
    get() {
        if (_linkedlnMark != null) {
            return _linkedlnMark!!
        }
        _linkedlnMark = Builder(
            name = "LinkedlnMark",
            defaultWidth = 75.294.dp,
            defaultHeight = 75.294.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF24292F)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0f, 0.0f)
                horizontalLineToRelative(-14.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, 2.239f, -5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.761f, 2.239f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.762f, 0.0f, 5.0f, -2.239f, 5.0f, -5.0f)
                verticalLineToRelative(-14.0f)
                curveToRelative(0.0f, -2.761f, -2.238f, -5.0f, -5.0f, -5.0f)
                close()
                moveToRelative(-11.0f, 19.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(11.0f)
                close()
                moveToRelative(-1.5f, -12.268f)
                curveToRelative(-0.966f, 0.0f, -1.75f, -0.79f, -1.75f, -1.764f)
                reflectiveCurveToRelative(0.784f, -1.764f, 1.75f, -1.764f)
                reflectiveCurveToRelative(1.75f, 0.79f, 1.75f, 1.764f)
                reflectiveCurveToRelative(-0.783f, 1.764f, -1.75f, 1.764f)
                close()
                moveToRelative(13.5f, 12.268f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.604f)
                curveToRelative(0.0f, -3.368f, -4.0f, -3.113f, -4.0f, 0.0f)
                verticalLineToRelative(5.604f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.765f)
                curveToRelative(1.396f, -2.586f, 7.0f, -2.777f, 7.0f, 2.476f)
                verticalLineToRelative(6.759f)
                close()
            }
        }
            .build()
        return _linkedlnMark!!
    }

private var _linkedlnMark: ImageVector? = null