package com.testassignment.shoppingcart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.testassignment.shoppingcart.domain.Product;

/**
 * Created by ashishn on 08/28/2017.
 */
public interface ProductRepository extends MongoRepository<Product, String> {

}
