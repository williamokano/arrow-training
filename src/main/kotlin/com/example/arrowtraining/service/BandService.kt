package com.example.arrowtraining.service

import arrow.core.Either
import arrow.core.computations.either
import com.example.arrowtraining.exception.BandError
import com.example.arrowtraining.model.Band
import org.springframework.stereotype.Service

@Service
class BandService {

    fun loadAllBands(): Either<BandError, List<Band>> {
        return either.eager { emptyList() }
    }
}
