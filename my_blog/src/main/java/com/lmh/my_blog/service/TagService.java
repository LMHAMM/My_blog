package com.lmh.my_blog.service;

import com.lmh.my_blog.vo.TagVo;

import java.util.List;

public interface TagService {

    List<TagVo> findTagsByArticleId(Long articleId);
    List<TagVo> hot(int limit);

}
