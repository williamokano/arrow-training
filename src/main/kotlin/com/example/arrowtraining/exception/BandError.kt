package com.example.arrowtraining.exception

import arrow.optics.optics

@optics
sealed class BandError {
    companion object
}

object BandNotFound : BandError()
