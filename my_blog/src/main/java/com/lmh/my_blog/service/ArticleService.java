package com.lmh.my_blog.service;

import com.lmh.my_blog.vo.ArticleVo;
import com.lmh.my_blog.vo.Result;
import com.lmh.my_blog.vo.params.PageParam;

import java.util.List;

public interface ArticleService {

    //分页查询文章列表
    List<ArticleVo> listArticlesPage(PageParam pageParam);
    //获取最热文章
    Result hotArticle(int limit);
    //最新文章
    Result newArticles(int limit);
    //文章归档
    Result listArchives();

}
