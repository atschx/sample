package com.atschx.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * Created by albert on 2019/3/6.
 */
@RestController
public class SampleApiController {

    @PostConstruct
    public void init() {

    }

    @RequestMapping(method = RequestMethod.GET, value = "a")
    public String test() {
        return "api";
    }

}
