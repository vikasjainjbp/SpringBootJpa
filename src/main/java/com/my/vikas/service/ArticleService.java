package com.my.vikas.service;

import com.my.vikas.model.Article;

import java.util.List;

public interface ArticleService {
    List<Article> findArticleByTitle(String title);

}
