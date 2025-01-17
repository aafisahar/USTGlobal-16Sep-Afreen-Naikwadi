package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Entity
@Table(name="voter_card")
@Data
public class VoterCard {

	@Column
	@Id
	private int vid;
	
	@Column
	private String vname;
	
	@Exclude
	@OneToOne(mappedBy = "voterCard")
	private Person person;
}
