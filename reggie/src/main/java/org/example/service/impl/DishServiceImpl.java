package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.entity.Dish;
import org.example.service.DishService;
import org.example.mapper.DishMapper;
import org.springframework.stereotype.Service;

/**
* @author symphony
* @description 针对表【dish(菜品管理)】的数据库操作Service实现
* @createDate 2024-05-09 16:39:57
*/
@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish>
    implements DishService{

}




