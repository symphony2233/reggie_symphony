package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.entity.Setmeal;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author symphony
* @description 针对表【setmeal(套餐)】的数据库操作Mapper
* @createDate 2024-05-09 16:40:14
* @Entity org.example.entity.Setmeal
*/
@Mapper
public interface SetmealMapper extends BaseMapper<Setmeal> {

}




