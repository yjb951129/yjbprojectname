package com.xm4399.run;

import com.xm4399.AppStart;
import com.xm4399.dao.MysqlDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootTest(classes = AppStart.class)
public class TestClass {

    @Autowired
    MysqlDao mysqlDao;

    @Test
    public  void test(){
        String sql = "select * from gamename_gameid limit 10";

        SqlRowSet sqlRowSet = mysqlDao.queryResultSet(sql);
        System.out.println(sqlRowSet);
    }

}
