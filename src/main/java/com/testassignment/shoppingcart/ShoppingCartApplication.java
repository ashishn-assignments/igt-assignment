package com.testassignment.shoppingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.testassignment.shoppingcart.service.ProductService;
import com.testassignment.shoppingcart.service.UserService;

@SpringBootApplication
public class ShoppingCartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(ShoppingCartApplication.class, args);

		ProductService productService = applicationContext.getBean(ProductService.class);
		productService.saveInitialBatch();

		UserService userService = applicationContext.getBean(UserService.class);
		userService.saveInitialBatch();


	}
	
/*	 @Bean
	    public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory,
	                                       MongoMappingContext context) {

	        MappingMongoConverter converter =
	                new MappingMongoConverter(new DefaultDbRefResolver(mongoDbFactory), context);
	        converter.setTypeMapper(new DefaultMongoTypeMapper(null));

	        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory, converter);

	        return mongoTemplate;

	    }
*/
	}
