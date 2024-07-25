package com.tech.cloud.feign.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.cloud.feign.client.api.UserClient;
import com.tech.cloud.feign.client.dto.UserResponse;

@SpringBootApplication
@RestController
@EnableFeignClients
public class SpringCloudFeignClientApplication {

	@Autowired
	private UserClient client;

	@GetMapping("/getAllUsers")
	public List<UserResponse> getAllUsers() {
		return client.getUsers();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignClientApplication.class, args);
	}

}
