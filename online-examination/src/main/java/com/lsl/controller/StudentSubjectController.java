package com.lsl.controller;


import com.lsl.entity.StudentSubject;
import com.lsl.service.StudentSubjectService;
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
@RequestMapping("/student-subject")
public class StudentSubjectController {
    @Autowired
    private StudentSubjectService studentSubjectService;

    @PostMapping("/add")
    public String addStudentSubject(@RequestBody StudentSubject studentSubject){
        studentSubjectService.save(studentSubject);
        return "ooooooo";
    }

    @PutMapping("/update")
    public boolean update(StudentSubject studentSubject){

        boolean tmp =studentSubjectService.saveOrUpdate(studentSubject);
        return tmp;
    }

    @DeleteMapping("/delete")
    public boolean deleteStudentSubject(@RequestBody int id){
        boolean tmp = studentSubjectService.removeById(id);
        return tmp;
    }

    @GetMapping("/info/{id}")
    public StudentSubject findUseByID(@PathVariable int id){
        StudentSubject studentSubject = studentSubjectService.getById(id);
        return studentSubject;
    }
}

