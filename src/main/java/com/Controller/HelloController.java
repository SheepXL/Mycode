package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//这个类所有方法全返回给浏览器（如果是对象 转为json数据）
/*@ResponseBody
@Controller*/
//以上两个注解的结合
@RestController
public class HelloController {
   @RequestMapping("/hello")
    public String Hello(){
        return "Hello World!";
        }
}
