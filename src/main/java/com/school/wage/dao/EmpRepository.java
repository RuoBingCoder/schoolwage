package com.school.wage.dao;

import com.school.wage.pojo.EmployeeMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpRepository extends JpaRepository<EmployeeMessage, Long> {
    /*@Query("select Tname from Teacher t where t.Tname like %?1%")
    public List<EmployeeMessage> findByTnameLike(String tname);*/


}
