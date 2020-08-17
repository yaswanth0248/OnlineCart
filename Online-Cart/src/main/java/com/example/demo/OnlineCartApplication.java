package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = { MongoAutoConfiguration.class,
		MongoDataAutoConfiguration.class }, scanBasePackages = { "com.example.*" })
@EnableMongoRepositories(basePackages = "com.example.*")
//@ComponentScan(basePackages = {"com.example.*"})
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class OnlineCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineCartApplication.class, args);
	}

}
