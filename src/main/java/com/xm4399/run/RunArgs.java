package com.xm4399.run;

import com.xm4399.log4j2.LOGGER;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.regex.Pattern;

@Component
public class RunArgs implements InitializingBean {

//    @Value("${mysql.url:jdbc:mysql://localhost/mydb?characterEncoding=UTF-8&tinyInt1isBit=false&useSSL=false}")
    protected String MYSQL_URL = "jdbc:mysql://localhost/mydb?characterEncoding=UTF-8&tinyInt1isBit=false&useSSL=false";
    @Value("${mysql.user:root}")
    protected String MYSQL_USER;
    @Value("${mysql.password:root}")
    protected String MYSQL_PASSWORD;

    public String getMYSQL_URL() {
        return MYSQL_URL;
    }
    public String getMYSQL_USER() {
        return MYSQL_USER;
    }
    public String getMYSQL_PASSWORD() {
        return MYSQL_PASSWORD;
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.logger.info(this.toString());
    }

    @Override
    public String toString() {
        return "runArgs:" +
                "\n mysql.url : " + MYSQL_URL
                + "\n mysql.user : " + MYSQL_USER
                + "\n mysql.password : " + MYSQL_PASSWORD
                ;
    }
}
