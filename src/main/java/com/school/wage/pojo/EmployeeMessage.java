package com.school.wage.pojo;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

/**
 * @Authur: 石建雷
 * @Date:2018/12/10 员工信息
 */
@Entity
@Table(name = "Teacher")
public class EmployeeMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long Tno;               // 职工号
    @NotEmpty(message = "职工名不能为空！")
    @Size(max = 20)
    private String Tname;             // 职工名
    @NotEmpty(message = "性别不能为空！")
    @Size(max = 20)
    private String Tsex;              // 性别
    @NotEmpty(message = "年龄不能为空！")
    @Size(max = 20)
    private String Tage;              // 年龄
    @NotEmpty(message = "所属部门不能为空！")
    @Size(max = 40)
    private String Depart;            // 所属部门
    @NotEmpty(message = "性别不能为空！")
    @Size(max = 20)
    private String Title;             // 职称
    /*@OneToOne(cascade = CascadeType.ALL)
    //EmployeeMessage是关系的维护端，当删除 people，会级联删除 address
    @JoinColumn(name = "Tno", referencedColumnName = "Tno")
    //EmployeeMessage中的EmployeeMessage_Tno字段参考change表中的Tno字段
    private Change change;

    public Change getChange() {
        return change;
    }

    public void setChange(Change change) {
        this.change = change;
    }*/
    /*@OneToMany(mappedBy = "Teacher",cascade = {CascadeType.ALL})
   @LazyCollection(LazyCollectionOption.EXTRA)
   //LazyCollection属性设置成EXTRA指定了当如果查询数据的个数时候，只会发出一条 count(*)的语句，提高性能
   private Set<Change> changes=new HashSet<Change>();*/

    public Long getTno() {
        return Tno;
    }

    public void setTno(Long tno) {
        Tno = tno;
    }

    public String getTname() {
        return Tname;
    }

    public void setTname(String tname) {
        Tname = tname;
    }

    public String getTsex() {
        return Tsex;
    }

    public void setTsex(String tsex) {
        Tsex = tsex;
    }

    public String getTage() {
        return Tage;
    }

    public void setTage(String tage) {
        Tage = tage;
    }

    public String getDepart() {
        return Depart;
    }

    public void setDepart(String depart) {
        Depart = depart;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }


    public EmployeeMessage() {
    }

    public EmployeeMessage( Long Tno,String tname,  String tsex,  String tage, String depart,  String title) {

        this.Tno=Tno;
        this.Tname = tname;
        this.Tsex = tsex;
        this.Tage = tage;
        this.Depart = depart;
        this.Title = title;

//        this.change = change;
    }

    @Override
    public String toString() {
        return "EmployeeMessage{" +
                "Tno=" + Tno +
                ", Tname='" + Tname + '\'' +
                ", Tsex='" + Tsex + '\'' +
                ", Tage='" + Tage + '\'' +
                ", Depart='" + Depart + '\'' +
                ", Title='" + Title + '\'' +

                '}';
    }
}