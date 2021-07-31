package com.huway0310.swagger.config;


import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 //開啟Swagger
public class SwaggerConfig {
	
	@Bean //配置docket以配置Swagger具体参数
	public Docket docket() {
	   return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
	}
	@Bean
	public Docket docket2(){
	   return new Docket(DocumentationType.SWAGGER_2).groupName("group2");
	}
	@Bean
	public Docket docket3(){
	   return new Docket(DocumentationType.SWAGGER_2).groupName("group3");
	}
	
	private ApiInfo apiInfo() {
		   Contact contact = new Contact("Wei", "個人網址", "g7huway0310@Gmail.com");
		   return new ApiInfo(
		           "Swagger練習", // 標題
		           "學習自定義Swagger", // 描述
		           "v1.0", // 版本
		           "http://terms.service.url/組織連結", // 組織連結
		           contact, // 聯絡人資訊
		           "Apach 2.0 許可", // 許可
		           "許可链接", // 許可连接
		           new ArrayList<>()// 擴展
		  );
		}

	
	
	
	

}
