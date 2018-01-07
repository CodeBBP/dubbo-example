package com.bbp.dubbo.example.rpc.service.impl;

import com.bbp.dubbo.example.dao.mapper.EmployeeMapper;
import com.bbp.dubbo.example.dao.model.Employee;
import com.bbp.dubbo.example.rpc.api.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 工程：sstudy
 * 包名：com.bbp.rpc
 * 描述：TODO
 * 作者：mrbbp@qq.com
 * 创建时间：2018年01月02日  23:10
 * <p>
 * <p>
 * 【修改历史】
 * 修改人：mrbbp@qq.com   修改时间：2018年01月02日  23:10     修改项描述：初始创建
 */

public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger LOGGER=LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public List<Employee> selectEmployeeByName(Employee employee) {
        return employeeMapper.selectEmployeeByName(employee);
    }

    @Override
    public void insertEmployee(Employee employee) {
        employeeMapper.insertEmployeeInMapper(employee);
    }

    @Override
    public void updateEmployeeById(Employee employee) {

    }
}
