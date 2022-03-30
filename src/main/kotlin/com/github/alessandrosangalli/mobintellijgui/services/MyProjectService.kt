package com.github.alessandrosangalli.mobintellijgui.services

import com.intellij.openapi.project.Project
import com.github.alessandrosangalli.mobintellijgui.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
