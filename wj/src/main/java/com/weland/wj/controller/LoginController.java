package com.weland.wj.controller;
import com.weland.wj.pojo.User;
import com.weland.wj.result.Result;
import com.weland.wj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;


@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser){
        String username=requestUser.getUsername();
        username=HtmlUtils.htmlEscape(username);
        
        User user = userService.get(username, requestUser.getPassword());
        if(null==user){
            return new Result(400);
        }else{
            return new Result(200);
        }
    }
}
