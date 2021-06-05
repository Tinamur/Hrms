package javaKamp.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javaKamp.hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "individual_users")
@PrimaryKeyJoinColumn(name = "individual_user_id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","users"})
public class IndividualUser extends User{
	
	@NotNull
	@NotBlank
	@Column(name = "first_name")
	private String firstName;
	
	@NotNull
	@NotBlank
	@Column(name = "last_name")
	private String lastName;
	
	@NotNull
	@NotBlank
	@Column(name = "nationality_number")
	private String nationalityNumber;
	
	@NotNull
	@NotBlank
	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;
	
	
	}
