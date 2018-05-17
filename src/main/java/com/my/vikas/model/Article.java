package com.my.vikas.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long articleId;

    private String title;

    @OneToMany
    private List<Comment> comments;

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(final List<Comment> comments) {
        this.comments = comments;
    }

    public String getTitle() {
        return title;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(final Long articleId) {
        this.articleId = articleId;
    }

    public void setTitle(final String title) {
        this.title = title;
    }
}
