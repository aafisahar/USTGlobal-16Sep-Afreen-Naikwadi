package com.ustglobal.jpawithhibernateapp.manytomany;

import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="studentInfo")
public class Student {

	@Column
	@Id
	private int sid;
	
	@Column
	private String sname;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="student_course", joinColumns=@JoinColumn(name="sid"), inverseJoinColumns=@JoinColumn(name="cid"))
	private List<Course> course;
}
