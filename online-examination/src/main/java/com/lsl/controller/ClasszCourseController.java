package com.lsl.controller;


import com.lsl.entity.ClasszCourse;
import com.lsl.service.ClasszCourseService;
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
@RequestMapping("/classz-course")
public class ClasszCourseController {
    @Autowired
    private ClasszCourseService classzCourseService;

    @PostMapping("/add")
    public String addClasszCourse(@RequestBody ClasszCourse classzCourse){
        classzCourseService.save(classzCourse);
        return "ooooooo";
    }

    @PutMapping("/update")
    public boolean update(ClasszCourse classzCourse){

        boolean tmp =classzCourseService.saveOrUpdate(classzCourse);
        return tmp;
    }

    @DeleteMapping("/delete")
    public boolean deleteClasszCourse(@RequestBody int id){
        boolean tmp = classzCourseService.removeById(id);
        return tmp;
    }

    @GetMapping("/info/{id}")
    public ClasszCourse findUseByID(@PathVariable int id){
        ClasszCourse classzCourse = classzCourseService.getById(id);
        return classzCourse;
    }
}

