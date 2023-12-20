package com.example.publishgitlib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform