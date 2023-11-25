package ru.maeasoftworks.normativecontrol.shared.utils

import io.ktor.server.application.Application
import io.ktor.server.routing.Routing
import org.kodein.di.DIAware
import org.kodein.di.instance

abstract class Component : DIAware {
    val application: Application by instance()
}

abstract class Controller : Component() {
    abstract fun Routing.registerRoutes()
}

abstract class Service : Component()

abstract class Repository : Component()