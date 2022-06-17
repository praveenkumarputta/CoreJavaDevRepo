package com.praveenp.config;


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
	public Docket buildDoc() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.praveenp.ctrl"))
				.paths(PathSelectors.regex("/insurence.*")).build();
//				.paths(PathSelectors.any()).build();
	}
}
	
//	 @Bean
//	    public Docket bankApi() {
//	        return new Docket(DocumentationType.SWAGGER_2)
//	                .select()                 .apis(RequestHandlerSelectors.basePackage("praveenp.praveenp.SwaggerConfig"))
//	                .paths(regex("/bank.*"))
//	                .build();
//
//
//}
//
//	private Predicate<String> regex(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
	
	/*
	@Bean
	public Docket api() {
	    return new Docket(DocumentationType.SWAGGER_2)
	            .select()
	            .apis(RequestHandlerSelectors.any())
	            .paths(PathSelectors.any())
	            .build();
	    }
	}
*/