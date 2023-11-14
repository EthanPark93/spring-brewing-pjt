package com.ethan.homebodybrewery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication(exclude = SecurityAutoConfiguration.class) // 시큐리티 자동 로그인 화면 없애는 방법
@SpringBootApplication
public class HomebodybreweryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebodybreweryApplication.class, args);
	}

}
