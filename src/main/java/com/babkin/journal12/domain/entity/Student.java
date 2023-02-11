package com.babkin.journal12.domain.entity;


import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
    @Id
    @Column(name="student_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;
    @Column(name = "groupp")
    private int groupp;

    public Student(String name, int groupp) {
        this.groupp = groupp;
        this.name = name;
    }
    public Student(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupp() {
        return groupp;
    }

    public void setGroupp(int groupp) {
        this.groupp = groupp;
    }
}
