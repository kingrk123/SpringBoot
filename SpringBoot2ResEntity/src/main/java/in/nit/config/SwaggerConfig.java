
package in.nit.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket createDocket() {
		//create empty Docket
		return new Docket(DocumentationType.SWAGGER_2) 
		.select()  //find controller classes
		
		//provide all controller common package name
		.apis(RequestHandlerSelectors.basePackage("in.nit.controller")) 
		
		//provide one common path of controllers
		.paths(PathSelectors.regex("/rest.*")) 
		
		.build() //create Docket with details
		
		.apiInfo(apiInfo())
		;
	}

	@SuppressWarnings("rawtypes")
	private ApiInfo apiInfo() {
		return new ApiInfo(
			"WELCOME TO TEST APP", 
			"This is used to Test Application only", 
			"R-3.5 GA", "https://nareshit.in/", 
			new Contact("NIT", "https://nareshit.in/", "javabyraghu@gmail.com"), 
			"NIT Licence", "https://nareshit.in/", new ArrayList<VendorExtension>());
	}
	
}

