package ru.maeasoftworks.normativecontrol.api.domain.dao

import org.komapper.annotation.*
import ru.maeasoftworks.normativecontrol.api.domain.EmailDomain
import ru.maeasoftworks.normativecontrol.api.infrastructure.security.Role

@Suppress("ArrayInDataClass")
@KomapperEntity(["users"])
@KomapperTable("users")
@KomapperOneToMany(targetEntity = Document::class, navigator = "documents")
data class User internal constructor(
    @KomapperId
    val id: String = null!!,
    var email: String,
    @KomapperEnum(EnumType.NAME)
    var domain: EmailDomain?,
    var password: String,
    @KomapperColumn("roles")
    var rolesStrings: Array<String> = emptyArray(),
    var isCredentialsVerified: Boolean = false
) {
    @setparam:KomapperIgnore
    var roles: Array<Role>
        get() = rolesStrings.map { Role.valueOf(it) }.toTypedArray()
        set(value) { rolesStrings = value.map { it.name }.toTypedArray() }

    constructor(
        id: String = null!!,
        email: String,
        domain: EmailDomain,
        password: String,
        roles: Array<Role> = emptyArray(),
        isCredentialsVerified: Boolean = false
    ) : this(id, email, domain, password, roles.map { it.name }.toTypedArray(), isCredentialsVerified)
}