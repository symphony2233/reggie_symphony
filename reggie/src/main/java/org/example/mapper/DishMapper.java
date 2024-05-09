package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.entity.Dish;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author symphony
* @description 针对表【dish(菜品管理)】的数据库操作Mapper
* @createDate 2024-05-09 16:39:57
* @Entity org.example.entity.Dish
*/
@Mapper
public interface DishMapper extends BaseMapper<Dish> {

}




