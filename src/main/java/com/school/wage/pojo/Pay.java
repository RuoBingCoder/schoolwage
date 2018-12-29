package com.school.wage.pojo;

import javax.persistence.*;

/**
 * @Authur: 石建雷
 * @Date:2018/12/17
 */
@Entity
@Table(name = "Pay")
public class Pay {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Tno;
    private String Base;                                     /*基本工资*/
    private String Overpay;                                      /*加班费*/
    private String Docked;                                      /*缺勤扣除工资*/
    private String Wages;

    public Long getTno() {
        return Tno;
    }

    public void setTno(Long tno) {
        Tno = tno;
    }

    public String getBase() {
        return Base;
    }

    public void setBase(String base) {
        Base = base;
    }

    public String getOverpay() {
        return Overpay;
    }

    public void setOverpay(String overpay) {
        Overpay = overpay;
    }

    public String getDocked() {
        return Docked;
    }

    public void setDocked(String docked) {
        Docked = docked;
    }

    public String getWages() {
        return Wages;
    }

    public void setWages(String wages) {
        Wages = wages;
    }

    public Pay(Long tno, String base, String overpay, String docked, String wages) {
        Tno = tno;
        Base = base;
        Overpay = overpay;
        Docked = docked;
        Wages = wages;
    }

    public Pay() {
    }

    @Override
    public String toString() {
        return "Pay{" +
                "Tno=" + Tno +
                ", Base='" + Base + '\'' +
                ", Overpay='" + Overpay + '\'' +
                ", Docked='" + Docked + '\'' +
                ", Wages='" + Wages + '\'' +
                '}';
    }
}
