package com.bl.bootcamp.articulo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bl"})
@MapperScan("com.bl.bootcamp.articulo.persistencia.mapper")
@OpenAPIDefinition(info = @Info(title = "articulo-svc", version = "${springdoc.version}", description = ""))
public class ArticuloApplication{

	public static void main(String[] args) {
		SpringApplication.run(ArticuloApplication.class, args);
	}

}
