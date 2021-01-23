package com.lsl.service.impl;

import com.lsl.entity.Menu;
import com.lsl.mapper.MenuMapper;
import com.lsl.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单管理 服务实现类
 * </p>
 *
 * @author lsl
 * @since 2021-01-23
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

}
