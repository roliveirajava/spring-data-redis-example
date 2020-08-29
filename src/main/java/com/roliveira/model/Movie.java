package com.roliveira.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String name;
    private String description;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
    public String toString(){
        return "Movie{" + "id=" +id + '\''  + ", name =" + name + "}";
    }

}