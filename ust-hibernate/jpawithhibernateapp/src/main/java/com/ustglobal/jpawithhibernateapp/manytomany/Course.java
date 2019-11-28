package com.ustglobal.jpawithhibernateapp.manytomany;

import java.util.List;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Data
@Entity
@Table(name="course")
public class Course {

	@Column
	@Id
	private int cid;
	
	@Column
	private String cname;
	
	@Exclude
	@ManyToMany(cascade= CascadeType.ALL, mappedBy="course")
	private List<Student> students;
}
