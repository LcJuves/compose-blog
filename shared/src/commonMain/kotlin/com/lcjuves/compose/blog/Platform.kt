package com.lcjuves.compose.blog

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform