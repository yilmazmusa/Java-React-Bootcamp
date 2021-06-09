package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_postings")
public class JobPosting {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="job_posting_id")
	private int JobPositionId;
	
	//@Column(name = "employer_id")
	//private int employerId;
	
	@ManyToOne()
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	@Column(name="description")
	private String description;
	
	@Column(name="city_id")
	private int cityId;
	
	@Column(name = "min_salary")
	private int minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;
	
	@Column(name = "quota")
	private int quato;
	
	@Column(name = "app_dead_line")
	private LocalDate appDeadline;
	
	@Column(name = "is_active")
	private boolean isActive=true;
	
	@Column(name = "release_date")
	private LocalDate releaseDate = LocalDate.now();

}
