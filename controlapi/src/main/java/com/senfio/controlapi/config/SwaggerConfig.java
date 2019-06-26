package com.senfio.controlapi.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ConditionalOnClass(Docket.class)
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	
	ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				   .title("Control")
				   .description("Serviços do sistema de Controle de Estoque Control")
				   .license("")
				   .termsOfServiceUrl("http://www.google.com.br")
				   .build();
	}
}
