package com.qianli.ilink.cloud_platform.messagecenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.qianli.ilink.cloud_platform.messagecenter.dao")
public class MessagecenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagecenterApplication.class, args);
	}
}
