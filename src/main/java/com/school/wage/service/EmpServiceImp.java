package com.school.wage.service;

import com.school.wage.dao.EmpRepository;
import com.school.wage.pojo.EmployeeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Authur: 石建雷
 * @Date:2018/12/10
 */
@Service
public class EmpServiceImp implements EmpService {
    @Autowired
    private EmpRepository empRepository;

    /**
     * @param emp
     * @return
     * @Transactional 事务注入
     */
    @Transactional
    @Override
    public EmployeeMessage saveUser(EmployeeMessage emp) {


        return empRepository.save(emp);
    }

    /**
     * 删除用户
     *
     * @param Tno
     */
    @Transactional
    @Override
    public void removeUser(Long Tno) {

        empRepository.deleteById(Tno);

    }

    /**
     *
     * @param emps
     */
    @Transactional
    @Override
    public void removeUsersInBatch(List<EmployeeMessage> emps) {

        empRepository.deleteInBatch(emps);

    }

    /**
     *更新用户
     * @param emp
     * @return
     */
    @Transactional
    @Override
    public EmployeeMessage updateUser(EmployeeMessage emp) {
        return empRepository.save(emp);
    }

   /*
    @Transactional
    @Override
    public List<EmployeeMessage> getUserByName(String Tname) {
        return empRepository.findByTnameLike(Tname);
    }*/

    @Transactional
    @Override
    public List<EmployeeMessage> listUsers() {

        return empRepository.findAll();
    }


}
