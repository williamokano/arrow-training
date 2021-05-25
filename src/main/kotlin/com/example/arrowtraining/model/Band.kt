package com.example.arrowtraining.model

import arrow.optics.optics

inline class BandName(val value: String) {
    companion object
}

@optics data class Band(val name: BandName) {
    companion object
}
