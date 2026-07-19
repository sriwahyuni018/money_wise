package com.sriwahyuni.moneywise.di

import com.sriwahyuni.moneywise.Greeting
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

val appModule = module {
    single { Greeting() }
}

fun initKoin(appDeclaration: KoinAppDeclaration = {}) =
    startKoin {
        appDeclaration()
        modules(
            appModule,
            platformModule()
        )
    }

// helper for iOS
fun initKoinShared() = initKoin {}

expect fun platformModule(): Module
