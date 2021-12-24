package br.com.vaniala.apprepository

import android.app.Application
import br.com.vaniala.apprepository.data.di.DataModule
import br.com.vaniala.apprepository.domain.di.DomainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()}

}