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
@Table(name = "job_advertisements")
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_advertisement_id")
	private int id;
	
	@NotNull
	@NotBlank
	@Column(name = "description")
	private String description;
	
	@NotNull
	@NotBlank
	@Column(name = "min_salary")
	private int minSalary;
	
	@NotNull
	@NotBlank
	@Column(name = "max_salary")
	private int maxSalary;
	
	@NotNull
	@NotBlank
	@Column(name = "available_position_count")
	private int availablePositionCount;
	
	@NotNull
	@NotBlank
	@Column(name = "last_application_date")
	private LocalDate lastApplicationDate;
	
	@NotNull
	@NotBlank
	@Column(name = "is_active")
	private boolean isActive;
	
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "corporate_id")
	private int corporateId;
}
