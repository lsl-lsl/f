package com.lsl.mapper;

import com.lsl.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lsl
 * @since 2021-01-23
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
