package com.lmh.my_blog.vo.params;

import lombok.Data;

@Data
public class LoginParam {
    private String account;
    private String password;
    private String nickname;
}
