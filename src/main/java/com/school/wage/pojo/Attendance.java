package com.school.wage.pojo;

import javax.persistence.*;

/**
 * @Authur: 石建雷
 * @Date:2018/12/16
 */
@Entity
@Table(name = "Attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Tno;  /*职工号*/

    private Integer Overtime;                         /*加班次数*/


    private Integer Absence;                    /*缺勤次数*/
    private Integer Dates;

    public Long getTno() {
        return Tno;
    }

    public void setTno(Long tno) {
        Tno = tno;
    }

    public Integer getOvertime() {
        return Overtime;
    }

    public void setOvertime(Integer overtime) {
        Overtime = overtime;
    }

    public Integer getAbsence() {
        return Absence;
    }

    public void setAbsence(Integer absence) {
        Absence = absence;
    }

    public Integer getDates() {
        return Dates;
    }

    public void setDates(Integer dates) {
        Dates = dates;
    }

    public Attendance() {
    }

    public Attendance(Integer overtime, Integer absence, Integer dates) {
        Overtime = overtime;
        Absence = absence;
        Dates = dates;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "Tno=" + Tno +
                ", Overtime=" + Overtime +
                ", Absence=" + Absence +
                ", Dates=" + Dates +
                '}';
    }
}
