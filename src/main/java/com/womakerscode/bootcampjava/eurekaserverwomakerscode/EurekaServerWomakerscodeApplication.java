package com.womakerscode.bootcampjava.eurekaserverwomakerscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerWomakerscodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerWomakerscodeApplication.class, args);
	}

}
