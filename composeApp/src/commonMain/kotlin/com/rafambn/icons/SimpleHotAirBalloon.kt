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

val SimpleBalloonVec: ImageVector
    get() {
        if (_simpleBalloon != null) {
            return _simpleBalloon!!
        }
        _simpleBalloon = Builder(
            name = "SimpleHotAirBalloon",
            defaultWidth = 280.0.dp,
            defaultHeight = 410.0.dp,
            viewportWidth = 280.0f,
            viewportHeight = 410.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF333E48)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(107.474f, 307.415f)
                horizontalLineTo(92.4194f)
                verticalLineTo(348.807f)
                horizontalLineTo(107.474f)
                verticalLineTo(307.415f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF333E48)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(188.189f, 307.415f)
                horizontalLineTo(173.135f)
                verticalLineTo(348.807f)
                horizontalLineTo(188.189f)
                verticalLineTo(307.415f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF65513C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(88.5705f, 366.908f)
                verticalLineTo(400.175f)
                curveTo(88.5705f, 404.786f, 93.2564f, 408.56f, 98.9861f, 408.56f)
                horizontalLineTo(181.622f)
                curveTo(187.35f, 408.56f, 192.037f, 404.787f, 192.037f, 400.175f)
                verticalLineTo(366.908f)
                horizontalLineTo(88.5705f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB08876)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(192.033f, 366.897f)
                horizontalLineTo(88.5695f)
                curveTo(83.1048f, 366.897f, 78.6748f, 362.483f, 78.6748f, 357.039f)
                curveTo(78.6748f, 351.594f, 83.1048f, 347.18f, 88.5695f, 347.18f)
                horizontalLineTo(192.033f)
                curveTo(197.497f, 347.18f, 201.926f, 351.594f, 201.926f, 357.039f)
                curveTo(201.927f, 362.483f, 197.498f, 366.897f, 192.033f, 366.897f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFF5959)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(88.7501f, 309.045f)
                curveTo(88.7501f, 269.494f, 1.59275f, 235.36f, 1.59275f, 140.597f)
                curveTo(1.59275f, 64.263f, 63.6968f, 2.38f, 140.303f, 2.38f)
                curveTo(216.909f, 2.38f, 279.013f, 64.262f, 279.013f, 140.597f)
                curveTo(279.013f, 235.357f, 191.856f, 269.493f, 191.856f, 309.045f)
                horizontalLineTo(88.7501f)
                close()
            }
        }
            .build()
        return _simpleBalloon!!
    }

private var _simpleBalloon: ImageVector? = null