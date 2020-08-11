package controller;

import com.crud.crud.service.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class PostController {

    @Autowired
    SubscribeService subscribeService;

    @GetMapping("/greeting")
    public String greeting() {
        return "Done";
    }

    @RequestMapping(value = "/subscribe", method = RequestMethod.POST)
    public String subscribe(@RequestParam(value = "productName") String productName, @RequestParam(name = "userId") String userId) {
        return subscribeService.subscribe(userId, productName);
    }
}
