package com.example.testdagger

import dagger.Module

@Module(
    subcomponents = [
        MainComponent::class
    ]
)
class AppSubcomponents