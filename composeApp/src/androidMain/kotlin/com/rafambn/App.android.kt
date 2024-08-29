package com.rafambn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp

class AppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { App(DpSize(1600.dp, 900.dp)) }
    }
}

//@Preview
//@Composable
//fun AlterPreview() {
//    Box(
//    ) {
//        Balloon(
//            vectorResource(Res.drawable.linkedln_mark),
//            "https://github.com/rafambn",
//            100.dp,
//            androidx.compose.ui.Modifier.align(Alignment.Center)
//        )
//    }
//}

@Preview(device = "spec:width=1600dp,height=900dp,dpi=640")
@Composable
fun WebPreview() {
    App(windowSizeDp = DpSize(1600.dp, 900.dp))
}

@Preview(device = "spec:width=400dp,height=800dp,dpi=640")
@Composable
fun AppPreview() {
    App(windowSizeDp = DpSize(400.dp, 800.dp))
}
