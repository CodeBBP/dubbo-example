package com.bbp.dubbo.example.rpc.api;

import com.bbp.dubbo.example.dao.model.Employee;

import java.util.List;

/**
 * 工程：sstudy
 * 包名：com.bbp.dubbo.example.rpc.api
 * 描述：TODO
 * 作者：mrbbp@qq.com
 * 创建时间：2018年01月02日  20:35
 * <p>
 * <p>
 * 【修改历史】
 * 修改人：mrbbp@qq.com   修改时间：2018年01月02日  20:35     修改项描述：初始创建
 */

public interface EmployeeService {
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
    void insertEmployee(Employee employee);

    /**
     * 根据雇员数据id更新雇员信息
     * @param employee
     */
    void updateEmployeeById(Employee employee);
}
