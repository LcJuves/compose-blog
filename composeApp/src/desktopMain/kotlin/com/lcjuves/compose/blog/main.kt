package com.lcjuves.compose.blog

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Liangcheng Juves' Compose Blog",
    ) {
        App()
    }
}