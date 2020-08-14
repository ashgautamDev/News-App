package com.example.newsapp.modle

import com.example.newsapp.modle.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)