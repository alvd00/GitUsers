package com.example.gitusers.model.repositories

import com.example.gitusers.model.GitUser

//Класс для использльзования и проверки данных без сети
class GitUsersFixRepo {

    private val repositories = listOf(
        GitUser("login1"),
        GitUser("login2"),
        GitUser("login3"),
        GitUser("login4")
    )

    fun getUsers() : List<GitUser>{
        return repositories
    }
}