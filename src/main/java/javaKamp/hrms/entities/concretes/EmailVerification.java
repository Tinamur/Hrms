package javaKamp.hrms.entities.concretes;

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
@Table(name = "email_verifications")
public class EmailVerification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "email_verification_id")
	private int id;
	
	@GeneratedValue(strategy = GenerationType.TABLE)// en uyugunu bu gibi geldi
	@Column(name = "user_id")
	private int userId;  //normalde yazmamıştım ama şimdi yazıyorum çünkü query sorgusu yapamıyorum
	
	@NotNull
	@NotBlank
	@Column(name = "verification_code")
	private String verificationCode;
	
	@NotNull
	@NotBlank
	@Column(name = "is_email_verified")
	private boolean isVerified;

	
}
