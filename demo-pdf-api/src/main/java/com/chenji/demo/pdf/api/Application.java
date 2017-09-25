package com.chenji.demo.pdf.api;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;


/**
 * Created by wangzhigang on 2017/4/13.
 */
@SpringBootApplication(exclude={ DataSourceAutoConfiguration.class, MybatisAutoConfiguration.class })
@ServletComponentScan
public class Application {
    public static void main( String[] args ) {
        SpringApplication.run(Application.class, args);
    }

}
