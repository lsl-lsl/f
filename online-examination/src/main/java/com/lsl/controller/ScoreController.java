package com.lsl.controller;


import com.lsl.entity.Score;
import com.lsl.service.ScoreService;
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
@RequestMapping("/score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @PostMapping("/add")
    public String addScore(@RequestBody Score score){
        scoreService.save(score);
        return "ooooooo";
    }

    @PutMapping("/update")
    public boolean update(Score score){

        boolean tmp =scoreService.saveOrUpdate(score);
        return tmp;
    }

    @DeleteMapping("/delete")
    public boolean deleteScore(@RequestBody int id){
        boolean tmp = scoreService.removeById(id);
        return tmp;
    }

    @GetMapping("/info/{id}")
    public Score findUseByID(@PathVariable int id){
        Score score = scoreService.getById(id);
        return score;
    }
}

