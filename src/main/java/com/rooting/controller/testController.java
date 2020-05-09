package com.rooting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class testController {

    @RequestMapping(value="/getLocation/{empCd}", method= RequestMethod.GET)
    public int getLocation(@PathVariable("empCd") BigDecimal empCd){
        return empCd.intValue();
    }
}
