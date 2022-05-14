package com.example.xy.service;

import com.example.xy.pojo.Article;

import java.util.List;

public interface ArticleService {

    List<Article> getAllArticle();

    boolean modif(Article article);

    boolean deletebyid(Integer id);

    Article getbyid(Integer id);

    boolean insert(Article article);
}
