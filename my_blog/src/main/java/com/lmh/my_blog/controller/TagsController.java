package com.lmh.my_blog.controller;

import com.lmh.my_blog.service.TagService;
import com.lmh.my_blog.vo.Result;
import com.lmh.my_blog.vo.TagVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tags")
public class TagsController {

    @Autowired
    private TagService tagService;

    @GetMapping("/hottags")
    public Result listHotTags() {
        int limit = 6;
        List<TagVo> tagVoList = tagService.hot(limit);
        return Result.success(tagVoList);
    }

}
