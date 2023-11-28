package com.test.test.entities

import org.springframework.data.annotation.Id
import java.time.LocalDateTime

data class Company(
    @Id
    val id: String?,
    var submitDate: LocalDateTime,
    var companyName: String,
    var symbol: String,
    var status: String,
    val actionDate: LocalDateTime
)

data class CreateCompany(
    var companyName: String,
    var symbol: String,
    var status: String,
)