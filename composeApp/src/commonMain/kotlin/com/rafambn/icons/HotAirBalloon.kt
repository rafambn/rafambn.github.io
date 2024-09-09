package com.rafambn.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

fun getBalloon(color1: Color, color2: Color): ImageVector {
    return Builder(
        name = "HotAirBalloon",
        defaultWidth = 153.0.dp,
        defaultHeight = 217.0.dp,
        viewportWidth = 153.0f,
        viewportHeight = 217.0f
    ).apply {
        group(name = "rope") {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(107.0f, 150.0f)
                lineTo(86.0f, 196.0f)
                lineTo(85.0f, 195.5f)
                lineTo(106.0f, 149.5f)
                lineTo(107.0f, 150.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(95.0f, 159.0f)
                lineTo(83.0f, 196.0f)
                lineTo(82.0f, 195.5f)
                lineTo(94.0f, 158.5f)
                lineTo(95.0f, 159.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(83.0f, 158.5f)
                verticalLineTo(196.0f)
                horizontalLineTo(82.0f)
                verticalLineTo(158.5f)
                horizontalLineTo(83.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(70.0f, 158.5f)
                verticalLineTo(196.0f)
                horizontalLineTo(71.0f)
                verticalLineTo(158.5f)
                horizontalLineTo(70.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(58.0f, 159.0f)
                lineTo(70.0f, 196.0f)
                lineTo(71.0f, 195.5f)
                lineTo(59.0f, 158.5f)
                lineTo(58.0f, 159.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(46.0f, 150.0f)
                lineTo(67.0f, 196.0f)
                lineTo(68.0f, 195.5f)
                lineTo(47.0f, 149.5f)
                lineTo(46.0f, 150.0f)
                close()
            }
        }
        group(name = "basket") {
            path(
                fill = SolidColor(Color(0xFF65513C)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(86.0f, 196.0f)
                horizontalLineTo(67.0f)
                verticalLineTo(214.0f)
                curveTo(67.0f, 215.0f, 68.0f, 216.0f, 69.0f, 216.0f)
                horizontalLineTo(84.0f)
                curveTo(85.0f, 216.0f, 86.0f, 215.0f, 86.0f, 214.0f)
                verticalLineTo(196.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB08876)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(87.0f, 194.0f)
                horizontalLineTo(66.0f)
                curveTo(65.45f, 194.0f, 65.0f, 194.45f, 65.0f, 195.0f)
                curveTo(65.0f, 195.55f, 65.45f, 196.0f, 66.0f, 196.0f)
                horizontalLineTo(87.0f)
                curveTo(87.5f, 196.0f, 88.0f, 195.55f, 88.0f, 195.0f)
                curveTo(88.0f, 194.45f, 87.5f, 194.0f, 87.0f, 194.0f)
                close()
            }
        }
        group(name = "balloon") {
            path(
                name = "outer-left",
                fill = SolidColor(color1), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(130.0f, 88.0f)
                curveTo(122.0f, 118.5f, 92.0f, 159.0f, 92.0f, 159.0f)
                horizontalLineTo(98.5f)
                curveTo(98.5f, 159.0f, 143.99f, 114.5f, 150.0f, 82.0f)
                curveTo(152.17f, 70.27f, 152.5f, 61.16f, 150.0f, 49.5f)
                curveTo(142.93f, 16.5f, 100.5f, 4.5f, 100.5f, 4.5f)
                curveTo(115.44f, 10.27f, 120.35f, 18.21f, 128.5f, 32.0f)
                curveTo(135.0f, 43.0f, 135.45f, 67.22f, 130.0f, 88.0f)
                close()
            }
            path(
                name = "outer-right",
                fill = SolidColor(color2), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(23.75f, 88.0f)
                curveTo(31.75f, 118.5f, 61.75f, 159.0f, 61.75f, 159.0f)
                horizontalLineTo(55.25f)
                curveTo(55.25f, 159.0f, 9.76f, 114.5f, 3.75f, 82.0f)
                curveTo(1.58f, 70.27f, 1.25f, 61.16f, 3.75f, 49.5f)
                curveTo(10.82f, 16.5f, 53.25f, 4.5f, 53.25f, 4.5f)
                curveTo(38.31f, 10.27f, 33.4f, 18.21f, 25.25f, 32.0f)
                curveTo(18.75f, 43.0f, 18.3f, 67.22f, 23.75f, 88.0f)
                close()
            }
            path(
                name = "mid-left",
                fill = SolidColor(color2), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(109.5f, 56.5f)
                curveTo(109.5f, 22.0f, 94.5f, 10.5f, 83.5f, 1.0f)
                curveTo(83.5f, 1.0f, 94.18f, 2.06f, 100.5f, 4.5f)
                curveTo(115.44f, 10.27f, 120.35f, 18.21f, 128.5f, 32.0f)
                curveTo(135.0f, 43.0f, 135.45f, 67.22f, 130.0f, 88.0f)
                curveTo(122.0f, 118.5f, 92.0f, 159.0f, 92.0f, 159.0f)
                horizontalLineTo(85.5f)
                curveTo(85.5f, 159.0f, 109.5f, 96.55f, 109.5f, 56.5f)
                close()
            }
            path(
                name = "mid-right",
                fill = SolidColor(color1), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(44.25f, 56.5f)
                curveTo(44.25f, 22.0f, 59.25f, 10.5f, 70.25f, 1.0f)
                curveTo(70.25f, 1.0f, 59.58f, 2.06f, 53.25f, 4.5f)
                curveTo(38.31f, 10.27f, 33.4f, 18.21f, 25.25f, 32.0f)
                curveTo(18.75f, 43.0f, 18.3f, 67.22f, 23.75f, 88.0f)
                curveTo(31.75f, 118.5f, 61.75f, 159.0f, 61.75f, 159.0f)
                horizontalLineTo(68.25f)
                curveTo(68.25f, 159.0f, 44.25f, 96.55f, 44.25f, 56.5f)
                close()
            }
            path(
                name = "inner-right",
                fill = SolidColor(color1), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(76.5f, 1.0f)
                verticalLineTo(159.0f)
                horizontalLineTo(85.5f)
                curveTo(85.5f, 159.0f, 109.5f, 96.55f, 109.5f, 56.5f)
                curveTo(109.5f, 22.0f, 94.5f, 10.5f, 83.5f, 1.0f)
                horizontalLineTo(76.5f)
                close()
            }
            path(
                name = "inner-left",
                fill = SolidColor(color2), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(77.25f, 1.0f)
                verticalLineTo(159.0f)
                horizontalLineTo(68.25f)
                curveTo(68.25f, 159.0f, 44.25f, 96.55f, 44.25f, 56.5f)
                curveTo(44.25f, 22.0f, 59.25f, 10.5f, 70.25f, 1.0f)
                horizontalLineTo(77.25f)
                close()
            }
        }
    }
        .build()
}