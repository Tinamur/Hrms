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
@Table(name = "user_experience_infos")
public class UserExperienceInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "experience_id")
	private int id;
	
	@NotNull
	@NotBlank
	@Column(name = "worked_at")
	private String userWorkedAt;
	
	@NotNull
	@NotBlank
	@Column(name = "worked_as")
	private String userWorkedAs;
	
	@NotNull
	@NotBlank
	@Column(name = "started_at")
	private LocalDate dateOfJobStart;
	
	@Column(name = "left_at")
	private LocalDate dateOfJobEnd;
}
