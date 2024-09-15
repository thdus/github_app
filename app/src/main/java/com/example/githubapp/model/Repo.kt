package com.example.githubapp.model

import com.google.gson.annotations.SerializedName
import org.intellij.lang.annotations.Language

data class Repo(
    @SerializedName("id")
    val id: Long,

    @SerializedName("name")
    val name: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("language")
    val language: String?,

    @SerializedName("stargazers_count")
    val starCount: Int,

    @SerializedName("fork_count")
    val forkCount: Int,

    @SerializedName("html_url")
    val htmlUrl: String,


)
