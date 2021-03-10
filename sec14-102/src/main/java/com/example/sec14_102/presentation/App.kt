package com.example.sec14_102.presentation

import android.app.Application
import com.example.sec14_102.BuildConfig
import com.example.sec14_102.presentation.di.Injector
import com.example.sec14_102.presentation.di.artist.ArtistSubComponent
import com.example.sec14_102.presentation.di.core.*
import com.example.sec14_102.presentation.di.movie.MovieSubComponent
import com.example.sec14_102.presentation.di.tvshow.TvShowSubComponent

class App : Application(), Injector {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()

    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
        return appComponent.tvShowSubComponent().create()
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        return appComponent.artistSubComponent().create()
    }
}
