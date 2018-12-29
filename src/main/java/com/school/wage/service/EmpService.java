package com.school.wage.service;

import com.school.wage.pojo.EmployeeMessage;

import java.util.List;

/**
 * @Authur: 石建雷
 * @Date:2018/12/10
 */

public interface EmpService {

    /**
     * 保存用户
     *
     * @return
     */
    EmployeeMessage saveUser(EmployeeMessage emp);

    /**
     * 删除用户
     *
     * @return
     */
    void removeUser(Long Tno);

    /**
     * 删除列表里面的用户
     *
     * @return
     */
    void removeUsersInBatch(List<EmployeeMessage> emps);

    /**
     * 更新用户
     *
     * @return
     */
    EmployeeMessage updateUser(EmployeeMessage emp);

    /**
     * 根据id获取用户
     *
     * @return
     */
//    List<EmployeeMessage> getUserByName(String Tname);

    /**
     * 获取用户列表
     *
     * @return
     */
    List<EmployeeMessage> listUsers();




}
