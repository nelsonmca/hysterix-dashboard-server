package io.nelson.nadar.hysteriadashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HysteriaDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HysteriaDashboardApplication.class, args);
	}

}
