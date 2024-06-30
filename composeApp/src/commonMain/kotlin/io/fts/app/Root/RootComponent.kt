package io.fts.app.Root

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.StackNavigation
import kotlinx.serialization.Serializable

class RootComponent(
    componentContext: ComponentContext
) : ComponentContext by componentContext {

    private val navigation = StackNavigation<Configuration>()

    @Serializable
    sealed class Configuration {

        @Serializable
        data object LoginScreen : Configuration()

        @Serializable
        data object HomeScreen : Configuration()

    }
}


