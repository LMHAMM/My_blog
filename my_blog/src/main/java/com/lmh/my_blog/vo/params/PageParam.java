package com.lmh.my_blog.vo.params;

import lombok.Data;

@Data
public class PageParam {
    private int page = 1;
    private int pageSize = 10;
}
