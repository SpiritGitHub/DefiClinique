/*package com.defitech.DefiClinique.Azhar.Configuration;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public Docket api(){
        return  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(
                        new ApiInfoBuilder()
                        .description("DefiClinique API documentation")
                        .title("DefiClinique")
                        .build()
                )
                .groupName("Rest API DefiClinique")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.defitech.DefiClinique"))
                .paths(PathSelectors.ant("deficlinique"+"/**"))
                .build();
    }
}

package com.defitech.DefiClinique.Chahib.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.defitech.DefiClinique.Chahib.control"))
                .paths(PathSelectors.any())
                .build();
    }
}
*/