package com.bbp.dubbo.example.dao.mapper;

import com.bbp.dubbo.example.dao.model.Employee;

import java.util.List;

public interface EmployeeMapper {
       /**
        * 根据雇员名字查找雇员具体信息
        * @param employee
        * @return
        */
       List<Employee> selectEmployeeByName(Employee employee);

       /**
        * 向数据库中插入雇员信息
        * @param employee
        */
       void insertEmployeeInMapper(Employee employee);

       /**
        * 根据雇员数据id更新雇员信息
        * @param employee
        */
       void updateEmployeeByIdInMapper(Employee employee);
}