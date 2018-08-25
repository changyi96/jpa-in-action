package com.chang.myblog.repository;

import com.chang.myblog.domain.User;
import java.util.List;

public interface UserRepository {
    /**
     * 新增或者修改用户
     */
    User saveOrUpateUser(User user);
    /**
     * 删除用户
     */
    void deleteUser(Long id);
    /**
     * 根据用户id获取用户
     */
    User getUserById(Long id);
    /**
     * 获取所有用户的列表
     */
    List<User> listUser();
}