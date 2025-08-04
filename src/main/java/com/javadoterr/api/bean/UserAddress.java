package com.javadoterr.api.bean;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_address")
public class UserAddress {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
	
	@EmbeddedId
	private UserAddressCK id;
	
	//private String street;
	private String city;
	private String state;
	private String country;
	//private String pinCode;
	
	// @oneToOne - Bidirectional mapping
	@OneToOne(mappedBy = "userAddress", fetch = FetchType.EAGER)
	@JsonBackReference
	private UserDetails userDetails;

}
