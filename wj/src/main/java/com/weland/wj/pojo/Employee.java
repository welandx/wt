package com.weland.wj.pojo;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "employee")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    String ep_name;
    String wage;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return ep_name;
    }

    public void setName(String name){
        this.ep_name = name;
    }

    public String getWage() {
        return wage;
    }
    public void setWage(){
        this.wage=wage;
    }
}
