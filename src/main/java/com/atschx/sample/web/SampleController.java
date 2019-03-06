package com.atschx.sample.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * Created by albert on 2019/3/6.
 */
@RestController
public class SampleController {

    @PostConstruct
    public void init() {

    }

    @RequestMapping(method = RequestMethod.GET, value = "x")
    public String test() {
        return "sample";
    }

}
