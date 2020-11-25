package com.github.randypaquette13.gitbranchcontextswitching.services

import com.intellij.openapi.project.Project
import com.github.randypaquette13.gitbranchcontextswitching.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
