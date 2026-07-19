package com.sriwahyuni.moneywise

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform