package com.neutraltimes.today.domain.di

import com.neutraltimes.today.domain.FormatDataUseCase
import com.neutraltimes.today.domain.GetLatestNewsUseCase
import org.koin.dsl.module

val domainDiModule = module {
    factory { FormatDataUseCase() }
    factory { GetLatestNewsUseCase(
                    formatDataUseCase = get(),
                    articlesRepository = get()
                )
    }
}