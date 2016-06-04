package com.wisdom.common.model;

import java.sql.Timestamp;

public class Company implements java.io.Serializable{
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private Integer parent_id;
    private Integer level;
    private Timestamp create_time;

 
    public Company() {
        super();
    }
    
    public Company(Integer id, String name, Integer parent_id, Integer level, Timestamp create_time){
    	this.id = id;
    	this.name = name;
    	this.parent_id = parent_id;
    	this.level = level;
    	this.create_time = create_time;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}

	public Timestamp getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}



	
    
 
}
