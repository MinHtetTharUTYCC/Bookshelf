package com.example.bookshellf.model

import kotlinx.serialization.Serializable

@Serializable
data class QueryResponse(
    val items: List<Book>,
    val totalItems: Int,
    val kind: String
)