package com.school.wage.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @Authur: 石建雷
 * @Date:2018/12/17
 */
@Entity
@Table(name = "Refer")
public class Refer {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid",strategy = "uuid2")
    @Column(name = "Title")
    private String Title;            /*职位*/
    private float Salary;            /*对应金额*/

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    public Refer() {
    }

    public Refer(String title, float salary) {
        Title = title;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Refer{" +
                "Title='" + Title + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
