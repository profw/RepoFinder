package ru.profw.repofinder.dao

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "liked_repositories")
data class LikedRepository(
    @PrimaryKey val id: Long,
    val name: String,
    val ownerLogin: String,
    val avatarUrl: String,
    val htmlUrl: String,
    val description: String?,
)