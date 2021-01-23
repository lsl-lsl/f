package com.lsl.controller;


import com.lsl.entity.Course;
import com.lsl.service.CourseService;
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
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public String addCourse(@RequestBody Course course){
        courseService.save(course);
        return "ooooooo";
    }

    @PutMapping("/update")
    public boolean update(Course course){

        boolean tmp =courseService.saveOrUpdate(course);
        return tmp;
    }

    @DeleteMapping("/delete")
    public boolean deleteCourse(@RequestBody int id){
        boolean tmp = courseService.removeById(id);
        return tmp;
    }

    @GetMapping("/info/{id}")
    public Course findUseByID(@PathVariable int id){
        Course course = courseService.getById(id);
        return course;
    }
}

