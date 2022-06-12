package com.bl.bootcamp.cuenta;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = { "com.bl" })
@MapperScan("com.bl.bootcamp.cuenta.persistencia.mapper")
@OpenAPIDefinition(info = @Info(title = "cuenta-svc", version = "${springdoc.version}", description = ""))
public class CuentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CuentaApplication.class, args);
	}

}
