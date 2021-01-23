package com.lsl.controller;


import com.lsl.entity.ClasszStudent;
import com.lsl.service.ClasszStudentService;
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
@RequestMapping("/classz-student")
public class ClasszStudentController {
    @Autowired
    private ClasszStudentService classzStudentService;

    @PostMapping("/add")
    public String addClasszStudent(@RequestBody ClasszStudent classzStudent){
        classzStudentService.save(classzStudent);
        return "ooooooo";
    }

    @PutMapping("/update")
    public boolean update(ClasszStudent classzStudent){

        boolean tmp =classzStudentService.saveOrUpdate(classzStudent);
        return tmp;
    }

    @DeleteMapping("/delete")
    public boolean deleteClasszStudent(@RequestBody int id){
        boolean tmp = classzStudentService.removeById(id);
        return tmp;
    }

    @GetMapping("/info/{id}")
    public ClasszStudent findUseByID(@PathVariable int id){
        ClasszStudent classzStudent = classzStudentService.getById(id);
        return classzStudent;
    }
}

