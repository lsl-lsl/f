package com.lsl.controller;


import com.lsl.entity.Classz;
import com.lsl.service.ClasszService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lsl
 * @since 2021-01-23
 */
@RestController
@RequestMapping("/classz")
public class ClasszController {
    @Autowired
    private ClasszService classzService;

    @PostMapping("/add")
    public String addClassz(@RequestBody Classz classz){
        classzService.save(classz);
        return "ooooooo";
    }

    @PutMapping("/update")
    public boolean update(Classz classz){

        boolean tmp =classzService.saveOrUpdate(classz);
        return tmp;
    }

    @DeleteMapping("/delete")
    public boolean deleteClassz(@RequestBody int id){
        boolean tmp = classzService.removeById(id);
        return tmp;
    }

    @GetMapping("/info/{id}")
    public Classz findUseByID(@PathVariable int id){
        Classz classz = classzService.getById(id);
        return classz;
    }
}

