package com.bbp.dubbo.example.rpc.api;

import com.bbp.dubbo.example.dao.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 工程：sstudy
 * 包名：com.bbp.dubbo.example.rpc.api
 * 描述：TODO
 * 作者：mrbbp@qq.com
 * 创建时间：2018年01月04日  17:47
 * <p>
 * <p>
 * 【修改历史】
 * 修改人：mrbbp@qq.com   修改时间：2018年01月04日  17:47     修改项描述：初始创建
 */

public class EmployeeServiceMock implements EmployeeService{

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceMock.class);

    @Override
    public List<Employee> selectEmployeeByName(Employee employee) {
        LOGGER.info("EmployeeServiceMock ++>>  selectEmployeeByName");
        return null;
    }

    @Override
    public void insertEmployee(Employee employee) {
        LOGGER.info("EmployeeServiceMock ++>>  insertEmployee");
    }

    @Override
    public void updateEmployeeById(Employee employee) {
        LOGGER.info("EmployeeServiceMock ++>>  updateEmployeeById");
    }
}
