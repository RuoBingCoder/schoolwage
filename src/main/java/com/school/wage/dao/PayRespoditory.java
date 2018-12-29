package com.school.wage.dao;

import com.school.wage.pojo.Pay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayRespoditory extends JpaRepository<Pay,Long> {

}
