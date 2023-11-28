package com.test.test.controller

import com.test.test.entities.Company
import com.test.test.entities.CreateCompany
import com.test.test.response.Response
import com.test.test.services.CompanyServices
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/company")
class CompanyController (private var companyService: CompanyServices){
    @GetMapping("/")
    fun getAll(): ResponseEntity<Any> = companyService.getAll()

    @PostMapping("/create-company")
    fun createCompany(@RequestBody company: CreateCompany): Company {
        return companyService.createCompany(company)
    }
}