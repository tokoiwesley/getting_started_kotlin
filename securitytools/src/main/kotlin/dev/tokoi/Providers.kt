package dev.tokoi

import java.security.Provider
import java.security.Security

data class ProviderDetails(val providerName: String, val name: String) {

}

class Providers {
    fun getProviders(): List<Provider> {
        val providers = Security.getProviders()
        val listOfProviders: List<Provider> = providers.asList()
        return listOfProviders
    }

    fun getAllProvidersEx(filter: String): List<ProviderDetails> {
        val providers = Security.getProviders()

        return providers.flatMap { provider ->
            provider.entries.filter { it ->
                it.key.toString().contains(filter, true)
            }.map { ProviderDetails(provider.name, it.key.toString()) }
        }

        // return listOfProviders
    }

    fun getAllProviders(filter: String): List<ProviderDetails> {
        val providers = Security.getProviders()
        val listOfProviders = mutableListOf<ProviderDetails>()

        providers.forEach { provider ->
            val providerDetails = provider.entries.filter { it ->
                it.key.toString().contains(filter, true)
            }.map { ProviderDetails(provider.name, it.key.toString()) }
            listOfProviders += (providerDetails)
        }

        return listOfProviders
    }

    companion object {
        fun getProviders(): List<Provider> {
            val providers = Security.getProviders()
            val listOfProviders: List<Provider> = providers.asList()
            return listOfProviders
        }
    }
}