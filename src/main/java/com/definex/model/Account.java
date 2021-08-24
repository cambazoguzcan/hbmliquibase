package com.definex.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Account {

	@Id
	private Long id;
	
	private String accountType;
	
	private BigDecimal amount;
	
	private Boolean isNew;
	
	private Long relatedAccount;
}
