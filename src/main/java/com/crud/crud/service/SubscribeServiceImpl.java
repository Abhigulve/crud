package com.crud.crud.service;

import com.crud.crud.dao.Reader;
import com.crud.crud.dao.Writer;
import model.Product;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscribeServiceImpl implements SubscribeService {

    @Autowired
    private Reader reader;

    @Autowired
    private Writer writer;

    @Override
    public String subscribe(String userId, String productName) {
        Product product = reader.getProduct(productName);
        User user=reader.getUserById(userId);
        user.getSubscribeProducts().add(product);
        writer.saveUser(user);
        return "subscribe for product " + productName;
    }
}
