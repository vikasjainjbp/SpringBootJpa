package com.my.vikas.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "website")
public class Website {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long websiteId;

    private String code;

    @OneToMany
    private List<Article> articles;

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(final List<Article> articles) {
        this.articles = articles;
    }

    public Long getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(final Long websiteId) {
        this.websiteId = websiteId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(final String code) {
        this.code = code;
    }
}
