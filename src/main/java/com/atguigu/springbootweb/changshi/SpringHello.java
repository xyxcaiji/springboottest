package com.atguigu.springbootweb.changshi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class SpringHello {

    @ResponseBody
    @RequestMapping("/hello")
    public String haha()
    {
        return "hello,我来了";
    }


    @RequestMapping("/success")
    public String haha1(Map<String,Object> map)
    {
        map.put("hello","hello,wolail");
        return "success";
    }

    @RequestMapping("/user/admin")
    public String delu()
    {
        return "login";
    }

}
