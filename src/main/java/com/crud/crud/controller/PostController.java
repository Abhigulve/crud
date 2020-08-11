package com.crud.crud.controller;

import com.crud.crud.service.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/test")
public class PostController {

    @Autowired
    SubscribeService subscribeService;

    @GetMapping("/greeting")
    public String greeting() {
        return "Done";
    }

    @RequestMapping(value = "/subscribe/{productName}/{userId}", method = RequestMethod.PUT)
    public String subscribe(@PathVariable(value = "productName") String productName, @PathVariable(name = "userId") String userId) {
        return subscribeService.subscribe(userId, productName);
    }
}
