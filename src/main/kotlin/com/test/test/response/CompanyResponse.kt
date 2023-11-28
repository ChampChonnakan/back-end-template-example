package com.test.test.response

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

//val responseForm = mapOf("status" to 0, "message" to "", "data" to "")

class CompanyResponse {
    fun success(data: Any): Map<String, Any> {
        return mapOf("status" to 200, "message" to "success", "data" to data)
    }

    fun fail(): Map<String, Any>{
        return mapOf("status" to 400, "message" to "fail")
    }
}

data class Response(
    var status: Int,
    var message: String,
    var data: Any?
)

