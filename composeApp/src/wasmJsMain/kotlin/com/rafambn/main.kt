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
    val head = document.head ?: return
    head.appendChild(appendTitle())
    head.appendChild(appendCharset())
    head.appendChild(appendCharset())
    head.appendChild(appendMetaData("viewport", "width=device-width, initial-scale=1.0"))
    head.appendChild(appendMetaData("author", "Rafael Mendonca"))
    head.appendChild(appendMetaData("description", "Rafael Mendonca's personal site"))
    head.appendChild(appendMetaData("keywords", "rafael mendonca, rafael, mendonca, rafambn, android developer, mobile developer, developer"))
    var canvasSize by mutableStateOf(DpSize(body.clientWidth.dp, body.offsetHeight.dp))
    window.onresize = {
        canvasSize = DpSize(window.innerWidth.dp, window.innerHeight.dp)
    }
    ComposeViewport(body) {
        App(canvasSize)
    }
    body.appendChild(appendHeader())
}

fun appendMetaData(name: String, content: String): Element {
    val meta = document.createElement("meta")
    meta.setAttribute("name", name)
    meta.setAttribute("content", content)
    return meta
}

fun appendCharset(): Element {
    val meta = document.createElement("meta")
    meta.setAttribute("charset", "UTF-8")
    return meta
}

fun appendTitle(): Element {
    val meta = document.createElement("title")
    meta.textContent = "Rafael Mendonca"
    return meta
}

fun appendHeader(): Element {
    val header = document.createElement("h1")
    header.textContent = "Welcome to my personal webpage"
    return header
}