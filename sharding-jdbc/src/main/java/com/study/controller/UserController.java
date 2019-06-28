package com.study.controller;

import com.study.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description controller
 * @Date 2019/6/27 18:00
 * @Version 1.0
 */
@RestController
@Slf4j
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public Object list(@RequestParam(value = "master",defaultValue = "false") boolean master) {
        log.info("list............");
        return userService.list(master);
    }
}
