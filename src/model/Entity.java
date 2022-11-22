package model;

import java.io.Serializable;

public abstract class Entity implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	private Integer ID;
	private String Name;
	
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
}