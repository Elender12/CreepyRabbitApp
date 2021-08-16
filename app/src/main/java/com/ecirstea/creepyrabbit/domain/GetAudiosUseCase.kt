package com.ecirstea.creepyrabbit.domain

import com.ecirstea.creepyrabbit.data.network.AudioDatabase

class GetAudiosUseCase {
    private val repository = AudioDatabase()
    operator fun invoke() = repository.getAllAudioFiles()
}