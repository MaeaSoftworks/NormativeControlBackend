package com.maeasoftworks.normativecontrol.documentation.objects

import org.springframework.http.HttpStatus

class Response(
    var httpStatus: HttpStatus = HttpStatus.OK,
    var type: String = "",
    var description: String = "",
    var body: String = ""
)
