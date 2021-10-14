import dev.tokoi.Providers

fun main(args: Array<String>) {
    val allProviders = Providers.getProviders()

    val it = allProviders.iterator()

    while (it.hasNext()) {
        val provider = it.next()
        println(provider.name)

        provider.forEach { key, value -> println("\t$key: $value") }
    }
}

fun listProvidersInstance() {
    val providers = Providers()

    val allProviders = providers.getProviders()

    val it = allProviders.iterator()

    while (it.hasNext()) {
        val provider = it.next()
        println(provider.name)

        provider.forEach { key, value -> println("\t$key: $value") }
    }
}

fun listProviders() {
    val providers = getProviders()

    val it = providers.iterator()

    while (it.hasNext()) {
        val provider = it.next()
        println(provider.name)

        provider.forEach { key, value -> println("\t$key: $value") }
    }
}