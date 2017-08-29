package com.testassignment.shoppingcart.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Created by ashishn on 08/28/2017.
 */
public class User implements Serializable{
    @Id
    private String id;

    private String name;
    private String email;

	@DBRef
    private Set<ShoppingCart> shoppingCarts = new HashSet<>();

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public User(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
