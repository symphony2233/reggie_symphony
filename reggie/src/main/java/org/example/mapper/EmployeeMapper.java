package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.entity.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author symphony
* @description 针对表【employee(员工信息)】的数据库操作Mapper
* @createDate 2024-05-08 10:21:26
* @Entity org.example.entity.Employee
*/
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}




