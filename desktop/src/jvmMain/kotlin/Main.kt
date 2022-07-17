// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.ning.common.NotepadApplication
import com.ning.common.rememberApplicationState
import com.ning.common.common.LocalAppResources
import com.ning.common.common.rememberAppResources
import com.ning.common.ui.MainView


fun main() = application {
    CompositionLocalProvider(LocalAppResources provides rememberAppResources()) {
        NotepadApplication(rememberApplicationState())
    }

//    Window(onCloseRequest = ::exitApplication) {
//        MainView()
//    }

}
