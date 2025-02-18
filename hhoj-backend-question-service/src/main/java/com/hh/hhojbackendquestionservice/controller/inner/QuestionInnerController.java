package com.hh.hhojbackendquestionservice.controller.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hh.hhojbackendmodel.entity.Question;
import com.hh.hhojbackendmodel.entity.QuestionSubmit;
import com.hh.hhojbackendquestionservice.service.QuestionService;
import com.hh.hhojbackendquestionservice.service.QuestionSubmitService;
import com.hh.hhojbackendserviceclient.service.QuestionFeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 黄昊
 * @version 1.0
 **/
@RestController
@RequestMapping("/inner")
public class QuestionInnerController implements QuestionFeignClient {
    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionSubmitService questionSubmitService;

    /**
     * 根据查询条件批量获取题目提交列表
     *
     * @param submitQueryWrapper
     * @return
     */
    @Override
    @GetMapping("/question_submit/list")
    public List<QuestionSubmit> list(@RequestBody QueryWrapper<QuestionSubmit> submitQueryWrapper) {
        return questionSubmitService.list(submitQueryWrapper);
    }

    /**
     * 根据查询条件获取题目
     *
     * @param questionQueryWrapper
     * @return
     */
    @Override
    @GetMapping("/get/one")
    public Question getOne(@RequestBody QueryWrapper<Question> questionQueryWrapper) {
        return questionService.getOne(questionQueryWrapper);
    }

    /**
     * 根据id获取题目提交记录
     *
     * @param questionSubmitId
     * @return
     */
    @Override
    @GetMapping("/question_submit/get/id")
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionSubmitId") long questionSubmitId) {
        return questionSubmitService.getById(questionSubmitId);
    }

    @Override
    @GetMapping("/get/id")
    public Question getQuestionById(@RequestParam("questionId") long questionId) {
        return questionService.getById(questionId);
    }

    @Override
    @PostMapping("/question_submit/update/id")
    public Boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit) {
        return questionSubmitService.updateById(questionSubmit);
    }
}
