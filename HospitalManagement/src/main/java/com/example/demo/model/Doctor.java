package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {
	public Doctor() {
		super();
	}
	@Id
	Long id;
	String Name;
	String Speaclist;
         public Doctor(Long id, String name, String speaclist) {
		super();
		this.id = id;
		Name = name;
		Speaclist = speaclist;
	}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getSpeaclist() {
			return Speaclist;
		}
		public void setSpeaclist(String speaclist) {
			Speaclist = speaclist;
		}
}
