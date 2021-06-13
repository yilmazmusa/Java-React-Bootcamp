package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@Table(name="employers")
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobPostings"})
public class Employer extends User {
	


	@NotBlank
	@NotNull(message="CompanyName can not be null")
	@Column(name="company_name")
	private String companyName;
	
	@NotBlank
	@NotNull(message="WebAddress cannot be null")
	@Column(name="web_address")
	private String webSite;
	
	@NotBlank
	@NotNull(message="Phone cannot be null")
	@Column(name="phone")
	private String phone;
	
	
	@Column(name="mail_is_verified", columnDefinition = "boolean default false")
	private boolean mailIsVerified=false;
	
	@Column(name="mng_is_verified",columnDefinition = "boolean default false")
	private boolean MngIsVerified;
	

	
	@JsonIgnore
	@OneToMany(mappedBy = "employer")
    private List<JobAdvert> jobAdvertisement;

}
