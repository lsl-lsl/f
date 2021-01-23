package com.lsl.controller;


import com.lsl.entity.Menu;
import com.lsl.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 菜单管理 前端控制器
 * </p>
 *
 * @author lsl
 * @since 2021-01-23
 */
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @PostMapping("/add")
    public String addMenu(@RequestBody Menu menu){
        menuService.save(menu);
        return "ooooooo";
    }

    @PutMapping("/update")
    public boolean update(Menu menu){

        boolean tmp =menuService.saveOrUpdate(menu);
        return tmp;
    }

    @DeleteMapping("/delete")
    public boolean deleteMenu(@RequestBody int id){
        boolean tmp = menuService.removeById(id);
        return tmp;
    }

    @GetMapping("/info/{id}")
    public Menu findUseByID(@PathVariable int id){
        Menu menu = menuService.getById(id);
        return menu;
    }
}

