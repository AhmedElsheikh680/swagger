package com.spring.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
//                .apis(RequestHandlerSelectors.any())
                    .apis(RequestHandlerSelectors.basePackage("com.spring.swagger"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaData());

    }

    private ApiInfo metaData(){
        Contact contact =
                new Contact("Ahmed Elsheikh", "https://www.facebook.com/profile.php?id=100007334026246", "ahmedelsheikh680@gmail.com");
        return new ApiInfo(
                "Spring Framework With Swagger",
                "Employee & Player Controller",
                "3.0.0",
                "https://swagger.io/",
                contact,
                "License https://swagger.io/",
                "https://swagger.io/",
                new ArrayList<>()
        );
    }
}
