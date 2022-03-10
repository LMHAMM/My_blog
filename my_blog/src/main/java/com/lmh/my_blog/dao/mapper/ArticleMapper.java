package com.lmh.my_blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lmh.my_blog.dao.dos.Archives;
import com.lmh.my_blog.dao.pojo.Article;

import java.util.List;

public interface ArticleMapper extends BaseMapper<Article> {
    List<Archives> listArchives();
}
