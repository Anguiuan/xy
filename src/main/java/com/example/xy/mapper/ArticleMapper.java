package com.example.xy.mapper;

import com.example.xy.pojo.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleMapper {

    boolean update(Article article);

    boolean delete(@Param("id") Integer id);

    List<Article> getAll();

    Article getById(@Param("id") Integer id);

    boolean insert(Article article);
}
