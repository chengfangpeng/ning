package com.ning.common.ui

import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.ning.common.platform.HomeFolder
import com.ning.common.ui.CodeViewer
import com.ning.common.ui.CodeViewerView
import com.ning.common.ui.common.AppTheme
import com.ning.common.ui.common.Settings
import com.ning.common.ui.editor.Editors
import com.ning.common.ui.filetree.FileTree

@Composable
fun MainView() {
    val codeViewer = remember {
        val editors = Editors()

        CodeViewer(
            editors = editors,
            fileTree = FileTree(HomeFolder, editors),
            settings = Settings()
        )
    }

    DisableSelection {
        MaterialTheme(
            colors = AppTheme.colors.material
        ) {
            Surface {
                CodeViewerView(codeViewer)
            }
        }
    }
}