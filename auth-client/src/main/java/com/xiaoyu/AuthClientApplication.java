package com.xiaoyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@EnableOAuth2Sso
@SpringBootApplication
public class AuthClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthClientApplication.class, args);
	}

}

