package com.ustglobal.jpawithhibernateapp.onetomany;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name="pencil")
@Data
public class Pencil {

	@Column
	@Id
	private int pid;
	
	@Column
	private String color;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="bid",nullable = false)
	private PencilBox pencilBox; 
}
