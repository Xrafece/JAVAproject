package com.xrafece.dao.impl;

import com.xrafece.dao.UserDao;

/**
 * @author Xrafece
 */
public class UserDaoImpl implements UserDao {

    /**
     * 修改无参构造方法，用来验证 Spring 容器创建 bean 时，默认使用无参构造方法。
     */
    public UserDaoImpl() {
        System.out.println("UserDaoImpl Constructor Method is running...");
    }

    /**
     * 模拟存储 User 对象
     */
    @Override
    public void saveUser() {
        System.out.println("UserDaoImpl User is saving...");
    }

}
