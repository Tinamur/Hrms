package javaKamp.hrms.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
//@AllArgsConstructor   //eğer daha fazla özellik eklenirse yorum olmaktan cıkarılacak
@Entity
@Table(name = "users_looking_for_job")
@PrimaryKeyJoinColumn(name = "user_looking_for_job_id")

public class UserLookingForJob extends IndividualUser{
	

}
