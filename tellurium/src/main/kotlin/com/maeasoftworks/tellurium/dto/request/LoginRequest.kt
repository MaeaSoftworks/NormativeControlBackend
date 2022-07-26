package com.maeasoftworks.tellurium.dto.request

import javax.validation.constraints.NotBlank

data class LoginRequest(
    @NotBlank
    val email: String,
    @NotBlank
    val password: String
)
