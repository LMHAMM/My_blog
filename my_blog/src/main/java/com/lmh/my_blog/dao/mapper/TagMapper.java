package com.lmh.my_blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lmh.my_blog.dao.pojo.Tag;

import java.util.List;

public interface TagMapper extends BaseMapper<Tag> {
    /**
     * 根据文章ID查询标签列表
     * @param articleId
     * @return
     */
    List<Tag> findTagsByArticleId(Long articleId);

    List<Tag> findTagsByTagIds(List<Long> tagIds);

    List<Long> findHotsTagIds(int limit);

}
