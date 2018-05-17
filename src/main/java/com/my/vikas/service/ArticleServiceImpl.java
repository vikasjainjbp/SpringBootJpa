package com.my.vikas.service;

import com.my.vikas.model.Article;
import com.my.vikas.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> findArticleByTitle(final String title) {
        return articleRepository.findArticleByTitle(title);
    }
}
