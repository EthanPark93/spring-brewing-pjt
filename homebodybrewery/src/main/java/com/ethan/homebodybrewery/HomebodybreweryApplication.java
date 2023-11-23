package com.ethan.homebodybrewery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//@SpringBootApplication(exclude = SecurityAutoConfiguration.class) // 시큐리티 자동 로그인 화면 없애는 방법
@SpringBootApplication
public class HomebodybreweryApplication {

	@Bean
	public BCryptPasswordEncoder encodePwd() {
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		SpringApplication.run(HomebodybreweryApplication.class, args);
	}

}
