package com.xm4399;

import com.xm4399.log4j2.LOGGER;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppStart {
    public static void main(String[] args) {
        SpringApplication.run(AppStart.class,args);
        LOGGER.logger.info("end");
    }
}
