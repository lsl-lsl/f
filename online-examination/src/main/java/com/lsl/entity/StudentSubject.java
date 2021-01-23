package com.lsl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lsl
 * @since 2021-01-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("oe_student_subject")
@ApiModel(value="StudentSubject对象", description="")
public class StudentSubject implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id",type = IdType.AUTO)
    @ApiModelProperty(value = "ID")
    private Integer id;

    @ApiModelProperty(value = "题目ID")
    private Integer subjectId;

    @ApiModelProperty(value = "学生ID,对应user表中user_id")
    private Integer studentId;

    @ApiModelProperty(value = "学生的答案")
    private String studentAnswer;

    @ApiModelProperty(value = "该题的得分")
    private Float studentSubjectScore;


}
