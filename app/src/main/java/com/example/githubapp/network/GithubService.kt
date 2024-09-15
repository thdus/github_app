package com.example.githubapp.network

import com.example.githubapp.model.Repo
import com.example.githubapp.model.UserDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubService {
    @GET("/users/{username}/repos")
    fun listRepos(@Path("username") username:String): Call<List<Repo>>

    @GET("search/users")
    fun searchUsers(@Query("q") query: String): Call<UserDto>
}
