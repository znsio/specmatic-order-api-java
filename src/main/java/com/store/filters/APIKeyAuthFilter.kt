package com.store.filters

import com.store.model.DB
import com.store.model.User
import jakarta.servlet.http.HttpServletRequest
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter

class APIKeyAuthFilter(private val principalRequestHeader: String, private val db: DB) :
    AbstractPreAuthenticatedProcessingFilter() {

    override fun setAuthenticationManager(authenticationManager: AuthenticationManager?) {
        super.setAuthenticationManager(authenticationManager)
    }

    override fun getPreAuthenticatedPrincipal(request: HttpServletRequest): Any {
        return User("user")
    }

    override fun getPreAuthenticatedCredentials(request: HttpServletRequest?): Any {
        return User("user")
    }
}