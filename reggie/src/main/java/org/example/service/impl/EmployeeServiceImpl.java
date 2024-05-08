package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.entity.Employee;
import org.example.service.EmployeeService;
import org.example.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

/**
* @author symphony
* @description 针对表【employee(员工信息)】的数据库操作Service实现
* @createDate 2024-05-08 10:21:26
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
    implements EmployeeService{

}




