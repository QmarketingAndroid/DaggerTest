package com.example.testdagger

import javax.inject.Inject

class MainViewModel @Inject constructor(private val someRepository: SomeRepository) {

    fun getLog(): String {
        return someRepository.getLog()
    }
}