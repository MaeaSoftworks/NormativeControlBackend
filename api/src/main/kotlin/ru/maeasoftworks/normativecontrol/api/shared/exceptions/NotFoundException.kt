package ru.maeasoftworks.normativecontrol.api.shared.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.NOT_FOUND)
class NotFoundException(message: String) : Exception(message)
