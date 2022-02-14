package com.example.testdagger

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SomeRepository @Inject constructor() {

    fun getLog(): String {
        return "Hello from Dagger 3"
    }
}