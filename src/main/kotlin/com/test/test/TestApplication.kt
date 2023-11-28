package com.test.test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.time.LocalDateTime

@SpringBootApplication
class TestApplication

fun main(args: Array<String>) {
	runApplication<TestApplication>(*args)
	println("================== ${LocalDateTime.now()}")
}
