package com.springcloud.springcloudproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@EnableZuulProxy
public class SpringCloudProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProxyApplication.class, args);
	}
}
