package com.trackme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by promod on 4/5/2018.
 */
@Controller
public class webController {
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String mainPage()
    {
        return "index";
    }
}
