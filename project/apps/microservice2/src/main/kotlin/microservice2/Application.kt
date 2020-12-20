package com.bunny.microservice2

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("microservice2")
		.start()
}

