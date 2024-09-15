package com.example.githubapp.network

import com.example.githubapp.model.Repo
import com.example.githubapp.model.UserDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubService {
    //@Headers("Authorization: Bearer 깃헙 토큰 넣기")
    @GET("/users/{username}/repos")
    fun listRepos(@Path("username") username:String): Call<List<Repo>>

    @GET("search/users")
    fun searchUsers(@Query("q") query: String): Call<UserDto>
}
