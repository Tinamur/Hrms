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
@Table(name = "user_programming_knowledge")
public class UserProgrammingKnowledge {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "knowledge_id")
	private int id;
	
	@NotNull
	@NotBlank
	@Column(name = "knowledge_name")
	private String programmingLanguageName;
}
