package com.bbp.dubbo.example.server.controller;

import com.bbp.dubbo.example.dao.model.Employee;
import com.bbp.dubbo.example.rpc.api.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 工程：sstudy
 * 包名：com.bbp.dubbo.example.server.controller
 * 描述：TODO
 * 作者：mrbbp@qq.com
 * 创建时间：2018年01月04日  15:52
 * <p>
 * <p>
 * 【修改历史】
 * 修改人：mrbbp@qq.com   修改时间：2018年01月04日  15:52     修改项描述：初始创建
 */
@Controller
@RequestMapping("/dubboexample")
public class EmployeeController {

    private final static Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/insertEmployee",method = RequestMethod.GET)
    @ResponseBody
    public String insertEmployee(){
        Employee employee=new Employee();
        employee.setId("100001");
        employee.setName("bbp");
        employee.setAge("18");
        employee.setGender("man");

        employeeService.insertEmployee(employee);

        return "insert new employee sucess...";

    }

    @RequestMapping(value = "/selectEmployeeByName",method = RequestMethod.GET)
    @ResponseBody
    public String selectEmployeeByName(){
        Employee employee=new Employee();
        employee.setName("bbp");

        List<Employee> employees=employeeService.selectEmployeeByName(employee);

        return "the result is:"+employees.toString();

    }

}
