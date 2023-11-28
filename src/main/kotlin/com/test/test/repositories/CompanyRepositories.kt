package com.test.test.repositories

import com.test.test.entities.Company
import org.springframework.data.mongodb.repository.MongoRepository

interface CompanyRepositories:MongoRepository<Company,String>{
//    fun getAll() : List<Company>
}