package com.lmh.my_blog.controller;

import com.lmh.my_blog.service.ArticleService;
import com.lmh.my_blog.vo.ArticleVo;
import com.lmh.my_blog.vo.Result;
import com.lmh.my_blog.vo.params.PageParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("articles")
public class ArticleController {


    @Autowired
    private ArticleService articleService;
    /**
     * 首页文章列表
     * @param pageParam
     * @return
     */

    @PostMapping
    public Result listArticle(@RequestBody PageParam pageParam){
        //ArticleVo 页面接收的数据
        List<ArticleVo> articles = articleService.listArticlesPage(pageParam);

        return Result.success(articles);
//        return articleService.listAricle(pageParams);
    }

    /**
     * 首页最热文章
     * @return
     */

    @PostMapping("/hotarticle")
    public Result hotArticle(){
        int limit = 5;
        return articleService.hotArticle(limit);
    }


    /**
     * 最新文章
     */
    @PostMapping("/newarticle")
    public Result newArticles(){
        int limit = 5;
        return articleService.newArticles(limit);
    }

    /**
     * 文章归档
     * @return
     */

    @PostMapping("/listArchives")
    public Result listArchives(){
        return articleService.listArchives();
    }

}
