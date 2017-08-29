package com.testassignment.shoppingcart.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.testassignment.shoppingcart.domain.ShoppingCart;

/**
 * Created by ashishn on 08/28/2017.
 */
public interface ShoppingCartRepository extends MongoRepository<ShoppingCart, String> {
    List<ShoppingCart> findByStatus(String status);
}
