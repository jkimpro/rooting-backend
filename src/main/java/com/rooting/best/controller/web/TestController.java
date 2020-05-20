package com.rooting.best.controller.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public int test() {
        return 0;
    }

}
