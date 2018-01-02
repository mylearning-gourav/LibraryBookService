package com.bookservice.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
    @Bean
    public Docket productApi() {
        /*return new Docket(DocumentationType.SWAGGER_2)
                .select()                 
                .apis(RequestHandlerSelectors.basePackage("com.bookservice.controller"))
                .paths(regex("/bookservices/*"))
                .build();*/
    	return new Docket(DocumentationType.SWAGGER_2)
//	        .apiInfo(apiInfo())
	        .select()
//	        .apis(RequestHandlerSelectors.any())
	        .apis(RequestHandlerSelectors.basePackage("com.bookservice.controller"))
	        .paths(PathSelectors.any())
	        .build();
    }

}
