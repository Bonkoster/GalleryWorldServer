package com.lukashman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.lukashman.config.DataBaseConfig;

@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
@Import({RepositoryRestMvcConfiguration.class, DataBaseConfig.class})
public class GalleryWorldServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(GalleryWorldServerApplication.class, args);
	}
}
