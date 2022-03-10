package com.lmh.my_blog.service;

import com.lmh.my_blog.dao.pojo.SysUser;
import com.lmh.my_blog.vo.Result;

public interface SysUserService {

    SysUser findUserById(Long id);
    SysUser findUser(String account, String pwd);
    Result getUserInfoByToken(String token);
    SysUser findUserByAccount(String account);//注册判断是否已存在
    void save(SysUser sysUser);//注册保存
}
