@file:Suppress("NewApi")

package com.ning.common.platform

actual val HomeFolder: File get() = java.io.File(System.getProperty("user.home")).toProjectFile()