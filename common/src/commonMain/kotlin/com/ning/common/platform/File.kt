package com.ning.common.platform

import kotlinx.coroutines.CoroutineScope
import com.ning.common.util.TextLines

expect val HomeFolder: File

interface File {
    val name: String
    val isDirectory: Boolean
    val children: List<File>
    val hasChildren: Boolean

    fun readLines(scope: CoroutineScope): TextLines
}