package javaKamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

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
@Table(name = "corporate_users")
@PrimaryKeyJoinColumn(name = "corporate_user_id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","users"})
public class CorporateUser extends User{
	
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "web_adress")
	private String webAdress;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "is_employee_verified")
	private boolean isEmployeeVerified;
	

}
