package com.rafambn

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.Element

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    val body = document.body ?: return
    var canvasSize by mutableStateOf(DpSize(body.clientWidth.dp, body.offsetHeight.dp))
    window.onresize = {
        canvasSize = DpSize(window.innerWidth.dp, window.innerHeight.dp)
    }
    ComposeViewport(body) {
        App(canvasSize)
    }
    body.appendChild(appendHeader())
}

fun appendHeader(): Element {
    val header = document.createElement("h1")
    header.textContent = "Welcome to my personal webpage"
    return header
}