package com.lsl.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
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
@TableName("oe_subject")
@ApiModel(value="Subject对象", description="")
public class Subject implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "题目ID")
    @TableId(value = "subject_id", type = IdType.AUTO)
    private Integer subjectId;

    @ApiModelProperty(value = "题目内容")
    private String subjectTitle;

    @ApiModelProperty(value = "题目类型 0：单选  1：多选  2：判断题")
    private Integer subjectType;

    @ApiModelProperty(value = "题目选项，选项之间以wdnmd进行分割")
    private String subjectOption;

    @ApiModelProperty(value = "题目答案")
    private String subjectAnswer;

    @ApiModelProperty(value = "题目分值")
    private Float subjectScore;

    @ApiModelProperty(value = "题目顺序号")
    private Integer subjectSort;

    @ApiModelProperty(value = "试卷")
    private Integer paperId;


}
