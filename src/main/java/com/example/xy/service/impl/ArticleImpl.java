package com.example.xy.service.impl;


import com.example.xy.mapper.ArticleMapper;
import com.example.xy.pojo.Article;
import com.example.xy.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleImpl implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    @Override
    public List<Article> getAllArticle() {
        List<Article> articles = articleMapper.getAll();
        return articles;
    }

    @Override
    public boolean modif(Article article) {
        return  articleMapper.update(article);
    }

    @Override
    public boolean deletebyid(Integer id) {
        return articleMapper.delete(id);
    }

    @Override
    public Article getbyid(Integer id) {
        return articleMapper.getById(id);
    }

    @Override
    public boolean insert(Article article) {
        return articleMapper.insert(article);
    }

}
