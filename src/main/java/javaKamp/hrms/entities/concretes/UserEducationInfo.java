package javaKamp.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_education_infos")
public class UserEducationInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="education_id")
	private int id;
	
	@NotNull
	@NotBlank
	@Column(name ="school_name")
	private String schoolName;
	
	@NotNull
	@NotBlank
	@Column(name ="department_name")
	private String departmentName;
	
	@NotNull
	@NotBlank
	@Column(name ="started_at")
	private LocalDate dateOfEnroll;
	
	@Column(name ="graduated_at")
	private LocalDate dateOfGraduation;
	
	
}
