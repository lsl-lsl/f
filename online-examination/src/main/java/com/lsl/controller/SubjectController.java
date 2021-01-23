package com.lsl.controller;


import com.lsl.entity.Subject;
import com.lsl.service.SubjectService;
import io.swagger.annotations.ApiImplicitParam;
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
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @PostMapping("/add")
    public String addSubject(@RequestBody Subject subject){
        subjectService.save(subject);
        return "ooooooo";
    }

    @PutMapping("/update")
    public boolean update(Subject subject){

        boolean tmp =subjectService.saveOrUpdate(subject);
        return tmp;
    }

    @DeleteMapping("/delete")
    public boolean deleteSubject(@RequestBody int id){
        boolean tmp = subjectService.removeById(id);
        return tmp;
    }

    @GetMapping("/info/{id}")
    public Subject findUseByID(@PathVariable int id){
        Subject subject = subjectService.getById(id);
        return subject;
    }

}

