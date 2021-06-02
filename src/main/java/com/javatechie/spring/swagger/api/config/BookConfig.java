package com.javatechie.spring.swagger.api.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class BookConfig {
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("pullarao").apiInfo(apiInfo()) 
		          .select()                                  
		          .apis(RequestHandlerSelectors.any())             
		          .paths(PathSelectors.any())                          
		          .build(); 
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Book Service")
				  .description("Simple Documentation Generated Using SWAGGER_2 for Book REST Api"
				  ) .termsOfServiceUrl(
				 "https://howtodoinjava.com/swagger2/swagger-spring-mvc-rest-example/")
				 .license("Pullarao Licence") .licenseUrl(
				 "https://howtodoinjava.com/swagger2/swagger-spring-mvc-rest-example/").
				 version("1.0").build();
	}

	/*
	 * private ApiInfo apiInfo() { return new ApiInfoBuilder().title("Book Service")
	 * .description("Simple Documentation Generated Using SWAGGER_2 for Book REST Api"
	 * ) .termsOfServiceUrl(
	 * "https://howtodoinjava.com/swagger2/swagger-spring-mvc-rest-example/")
	 * .license("Pullarao Licence") .licenseUrl(
	 * "https://howtodoinjava.com/swagger2/swagger-spring-mvc-rest-example/").
	 * version("1.0").build(); }
	 */	

}
