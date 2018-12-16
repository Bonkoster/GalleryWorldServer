package com.lukashman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.lukashman.config.DataBaseConfig;
import com.lukashman.config.RepositoryRestConfig;

@Configuration
@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
@Import({DataBaseConfig.class, RepositoryRestConfig.class})
public class GalleryWorldServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(GalleryWorldServerApplication.class, args);
	}
}
