package com.my.vikas.repository;

import com.my.vikas.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Long>{

    @Query("select article from Article  article where article.title like CONCAT(:title,'%')")
    List<Article> findArticleByTitle(@Param("title") String title);
}
