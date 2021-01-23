package com.lsl.controller;


import com.lsl.entity.Paper;
import com.lsl.service.PaperService;
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
@RequestMapping("/paper")
public class PaperController {
    @Autowired
    private PaperService paperService;

    @PostMapping("/add")
    public String addPaper(@RequestBody Paper paper){
        paperService.save(paper);
        return "ooooooo";
    }

    @PutMapping("/update")
    public boolean update(Paper paper){

        boolean tmp =paperService.saveOrUpdate(paper);
        return tmp;
    }

    @DeleteMapping("/delete")
    public boolean deletePaper(@RequestBody int id){
        boolean tmp = paperService.removeById(id);
        return tmp;
    }

    @GetMapping("/info/{id}")
    public Paper findUseByID(@PathVariable int id){
        Paper paper = paperService.getById(id);
        return paper;
    }
}

