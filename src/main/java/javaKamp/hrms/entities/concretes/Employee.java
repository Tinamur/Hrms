package javaKamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
@PrimaryKeyJoinColumn(name = "employee_id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","users"})
public class Employee extends IndividualUser{
	
	//@Column(name = "id")
	//private int id;
	
	@NotNull
	@NotBlank
	@Column(name = "iban_number")
	private String ibanNumber;
	
	

}
