package ru.maeasoftworks.normativecontrol.api.shared.configurations

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SerializerConfiguration {
    @Bean
    fun objectMapper(): ObjectMapper {
        return ObjectMapper()
    }
}
