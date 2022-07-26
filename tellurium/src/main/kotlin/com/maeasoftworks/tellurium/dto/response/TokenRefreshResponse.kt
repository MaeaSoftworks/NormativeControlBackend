package com.maeasoftworks.tellurium.dto.response

import com.fasterxml.jackson.annotation.JsonProperty

data class TokenRefreshResponse(
    @get:JsonProperty(value = "access-token")
    val accessToken: String,

    @get:JsonProperty(value = "refresh-token")
    val refreshToken: String,

    @get:JsonProperty(value = "token-type")
    val tokenType: String = "Bearer"
)
