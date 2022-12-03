package com.demo.koinsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.demo.koinsample.ui.theme.KoinsampleTheme
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.compose.getViewModel
import org.koin.androidx.scope.activityScope
import org.koin.core.qualifier.named
import org.koin.core.scope.Scope
import org.koin.java.KoinJavaComponent.inject

class MainActivity : ComponentActivity(), AndroidScopeComponent {
//    private val viewModel by viewModel<MainViewModel>()
    override val scope: Scope by activityScope()
    private val hello by inject<String>(named("bye"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println(hello)
        setContent {
            KoinsampleTheme {
                val viewModel = getViewModel<MainViewModel>()
                viewModel.doNetworkCall()
            }
        }
    }
}