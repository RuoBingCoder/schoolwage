package com.school.wage.pojo;

import com.school.wage.controller.Display;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

/**
 * @Authur: 石建雷
 * @Date:2018/12/12
 */
@Entity
@Table(name = "Change")
public class Change {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Tno;
    private String Title1;                 /*之前的职称*/
    private String Title2;                   /*现职称*/
    private Long Dates;


    /*@OneToOne(cascade = CascadeType.ALL, mappedBy = "employeeMessage")  //维护方
    private EmployeeMessage employeeMessage;

    public EmployeeMessage getEmployeeMessage() {
        return employeeMessage;
    }

    public void setEmployeeMessage(EmployeeMessage employeeMessage) {
        this.employeeMessage = employeeMessage;
    }*/

    public Long getTno() {
        return Tno;
    }

    public void setTno(Long tno) {
        Tno = tno;
    }

    public String getTitle1() {
        return Title1;
    }

    public void setTitle1(String title1) {
        Title1 = title1;
    }

    public String getTitle2() {
        return Title2;
    }

    public void setTitle2(String title2) {
        Title2 = title2;
    }

    public Long getDates() {
        return Dates;
    }

    public void setDates(Long dates) {
        Dates = dates;
    }

    public Change(Long Tno, String title1, String title2, Long dates) {
        this.Tno = Tno;
        this.Title1 = title1;
        this.Title2 = title2;
        this.Dates = dates;

    }

    public Change() {
    }

    @Override
    public String toString() {
        return "Change{" +
                "Tno=" + Tno +
                ", Title1='" + Title1 + '\'' +
                ", Title2='" + Title2 + '\'' +
                ", Dates=" + Dates +
                '}';
    }
}
