package com.bunny.microservice1

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("microservice1")
		.start()
}

