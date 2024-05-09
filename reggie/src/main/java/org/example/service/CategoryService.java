package org.example.service;

import org.example.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author symphony
* @description 针对表【category(菜品及套餐分类)】的数据库操作Service
* @createDate 2024-05-09 15:27:35
*/
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
