package com.example.githubapp.network

import com.example.githubapp.model.Repo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {
    @GET("/users/{username}/repos")
    fun listRepos(@Path("username") username:String): Call<List<Repo>>
}
