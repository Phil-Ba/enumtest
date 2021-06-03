package at.bayava

import io.micronaut.runtime.Micronaut.*
import mu.KotlinLogging

fun main(args: Array<String>) {

    build()
        .args(*args)
        .packages("at.bayava")
        .start()
}

