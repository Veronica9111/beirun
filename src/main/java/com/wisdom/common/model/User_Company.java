package com.wisdom.common.model;
import java.sql.Timestamp;


public class User_Company implements java.io.Serializable{
private static final long serialVersionUID = 1L;
private Integer company_id;
private Integer user_id;
private Integer id;
    public User_Company() {
        super();
    }

    public User_Company(Integer company_id, Integer user_id, Integer id){
        this.company_id = company_id;
        this.user_id = user_id;
        this.id = id;
    }

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id){
        this.company_id = company_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id){
        this.user_id = user_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

}