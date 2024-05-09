package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author symphony
* @description 针对表【category(菜品及套餐分类)】的数据库操作Mapper
* @createDate 2024-05-09 15:27:35
* @Entity org.example.entity.Category
*/
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}




