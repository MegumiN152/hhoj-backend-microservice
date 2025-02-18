package com.hh.hhojbackendquestionservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hh.hhojbackendmodel.entity.QuestionSubmit;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ybb
* @description 针对表【question_submit(题目提交)】的数据库操作Mapper
* @createDate 2024-12-10 21:28:49
* @Entity com.yupi.hhoj.model.entity.QuestionSubmit
*/
@Mapper
public interface QuestionSubmitMapper extends BaseMapper<QuestionSubmit> {

}




