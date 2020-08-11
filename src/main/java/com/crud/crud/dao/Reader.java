package com.crud.crud.dao;

import model.Organisation;
import model.Product;
import model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class Reader {

    List<Product> products = new ArrayList<>();
    List<User> users = new ArrayList<>();

    public Reader() {
        products.add(new Product("a"));
        products.add(new Product("b"));
        products.add(new Product("c"));
        products.add(new Product("d"));
        users.add(new User("a", "a12", new Organisation("Org.io"), new ArrayList<>(products)));
        users.add(new User("b", "a11", new Organisation("pq.io"), new ArrayList<>(products)));
        users.add(new User("c", "a13", new Organisation("xyz.io"), new ArrayList<>(products)));

    }

    public Product getProduct(String productName) {
        for (Product product : products
        ) {
            if (product.getProduct().equalsIgnoreCase(productName))
                return product;
        }
        return null;
    }

    public User getUserById(String userId) {
        for (User user : users) {
            if (user.getUserId().equalsIgnoreCase(userId)) {
                return user;
            }
        }
        return null;
    }
}
