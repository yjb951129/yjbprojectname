package com.xm4399.dao;

import com.xm4399.run.RunArgs;
import com.xm4399.util.JdbcUtil;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;


@Component
public class MysqlDao implements InitializingBean {
    @Autowired
    RunArgs runArgs;
    private JdbcTemplate jdbcTemplate;


    @Override
    public void afterPropertiesSet() throws Exception {
        jdbcTemplate = JdbcUtil.getJdbcTemplate(runArgs.getMYSQL_URL(),runArgs.getMYSQL_USER(),runArgs.getMYSQL_PASSWORD());
    }


    /**
     *
     * @param sql
     * @return
     */
    public SqlRowSet queryResultSet(String sql){
        return jdbcTemplate.queryForRowSet(sql);
    }
    /**
     *
     * @param sql
     * @param args
     * @return
     */
    public SqlRowSet queryResultSet(String sql,@Nullable Object... args){
        return jdbcTemplate.queryForRowSet(sql,args);
    }
}
