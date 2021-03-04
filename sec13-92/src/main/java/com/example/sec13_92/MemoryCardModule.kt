package com.example.sec13_92

import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule {

    @Provides
    fun providesMemoryCard(): MemoryCard {
        return MemoryCard()
    }
}
