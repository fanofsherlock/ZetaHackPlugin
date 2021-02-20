package com.github.fanofsherlock.zetahackplugin.services

import com.github.fanofsherlock.zetahackplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
