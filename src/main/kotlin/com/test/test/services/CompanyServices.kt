package com.test.test.services

import com.test.test.entities.Company
import com.test.test.entities.CreateCompany
import com.test.test.repositories.CompanyRepositories
import com.test.test.response.Response
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.time.LocalDateTime

//Handle logic
@Service
class CompanyServices(var companyRepository: CompanyRepositories) {
    fun getAll(): ResponseEntity<Any> = companyRepository.findAll().let {
        if (it.isNotEmpty()) ResponseEntity(
            Response(status = 200, message = "success", data = it),
            HttpStatus.OK
        ) else ResponseEntity(Response(status = 404, message = "no data found", data = it), HttpStatus.NOT_FOUND)
    }

    fun createCompany(company: CreateCompany) = companyRepository.save(
        Company(
            id = null,
            actionDate = LocalDateTime.now(),
            submitDate = LocalDateTime.now(),
            companyName = company.companyName,
            symbol = company.symbol,
            status = company.status
        )
    )


}