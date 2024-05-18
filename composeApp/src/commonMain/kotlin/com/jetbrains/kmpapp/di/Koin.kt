package com.jetbrains.kmpapp.di

import com.jetbrains.kmpapp.network.NetworkClient.provideHttpClient
import org.koin.core.context.startKoin
import org.koin.dsl.module

val dataModule = module {
    single {
        provideHttpClient()
    }
}

val screenModelsModule = module {
    // fixme add missing factories
}

fun initKoin() {
    startKoin {
        modules(
            dataModule,
            screenModelsModule,
        )
    }
}
