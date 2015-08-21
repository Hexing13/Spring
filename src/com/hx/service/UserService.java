package com.hx.service;

import com.hx.dao.UserDao;
import com.hx.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by hexing on 15-8-19.
 */
@Component("userservice")
public class UserService {
    private UserDao dao;

    public UserDao getDao() {
        return dao;
    }

    @Resource(name = "orcal")
    public void setDao(UserDao dao) {
        this.dao = dao;
    }
    
    public void add(User u){
        this.dao.save(u);
        System.out.println("已经添加");
    }
}
