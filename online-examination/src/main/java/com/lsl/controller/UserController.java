package com.lsl.controller;


import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.lsl.entity.User;
import com.lsl.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lsl
 * @since 2021-01-23
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        userService.save(user);
        return "ooooooo";
    }

    @PutMapping("/update")
    public boolean update(User user){

        boolean tmp =userService.saveOrUpdate(user);
        return tmp;
    }

    @DeleteMapping("/delete")
    public boolean deleteUser(@RequestBody int id){
        boolean tmp = userService.removeById(id);
        return tmp;
    }

    @GetMapping("/info/{id}")
    public User findUseByID(@PathVariable int id){
        User user = userService.getById(id);
        return user;
    }

    @GetMapping("/info")
    @ApiImplicitParam(name = "account", dataType = "Integer")
    public User findUserByAccount(int account){
        User user = userService.findUserByAccount(account);
        return user;
    }
}

