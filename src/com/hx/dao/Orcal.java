package com.hx.dao;

import com.hx.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


/**
 * Created by hexing on 15-8-19.
 */
@Component("orcal")
public class Orcal implements UserDao{
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    @Resource
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void save(User u) {
        try {
            Connection conn = dataSource.getConnection();
            conn.createStatement().executeUpdate("insert into spring values(null,'zhangsan')");
            conn.close();
         } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("存入Orcal数据库");
    }
}
