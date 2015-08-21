package com.hx.dao;

import com.hx.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by hexing on 15-8-19.
 */
@Component("mysql")
public class Mysql implements UserDao{

    @Override
    public void save(User u) {
        System.out.println("存入Mysql数据库!");
    }

}
