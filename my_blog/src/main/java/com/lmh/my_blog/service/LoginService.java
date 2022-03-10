package com.lmh.my_blog.service;

import com.lmh.my_blog.dao.pojo.SysUser;
import com.lmh.my_blog.vo.Result;
import com.lmh.my_blog.vo.params.LoginParam;

public interface LoginService {
    /**
    * @Description: 登录功能
    * @Author: lmh
    * @Date: 2022/3/8 13:53
    */
    Result login(LoginParam loginParam);
    Result logout(String token);
    Result register(LoginParam loginParam);
    SysUser checkToken(String token);
}
