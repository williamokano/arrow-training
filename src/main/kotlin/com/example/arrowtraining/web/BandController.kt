package com.example.arrowtraining.web

import com.example.arrowtraining.model.Band
import com.example.arrowtraining.service.BandService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/bands")
class BandController(private val bandService: BandService) {

    @GetMapping
    fun home(): List<Band> {
        return bandService.loadAllBands()
            .fold(
                ifLeft = { emptyList() },
                ifRight = { it }
            )
    }
}
