package com.yonghe.web.controller;

import com.yonghe.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yonghe
 * @date 2020/04/27 15:35
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/nick/{uid}")
    public String findUserNick(@PathVariable("uid") Long uid) {
        String nick = userService.getUserNickByUid(uid);
        return nick;
    }

}
