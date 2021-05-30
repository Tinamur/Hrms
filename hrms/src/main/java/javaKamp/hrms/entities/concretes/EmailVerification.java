package javaKamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "email_verification")
public class EmailVerification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "email_verification_id")
	private int id;
	
	//private userId; yazmadım çünkü başka tablodan beslenecek, ama yazılmamalı mı emin değilim
	
	@Column(name = "verification_code")
	private String verificationCode;
	
	@Column(name = "is_email_verified")
	private boolean isVerified;

	
}
