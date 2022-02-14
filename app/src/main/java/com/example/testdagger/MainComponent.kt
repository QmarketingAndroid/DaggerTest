package com.example.testdagger

import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface MainComponent {

    // Factory to create instances of LoginComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): MainComponent
    }

    fun inject(activity: MainActivity)
}