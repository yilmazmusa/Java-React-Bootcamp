package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers") 
	public class EmployersController {
	
	private EmployerService employersService;

	@Autowired
	public EmployersController(EmployerService employersService) {
		this.employersService = employersService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		
		return this.employersService.add(employer);
	}

	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll() {
		
		return this.employersService.getAll();
	}
	
//	@PostMapping("/update")
//	public Result update(String mail, String password, String companyName, String webSite, String phone, int id) {
//		
//		return this.employersService.updateEmployer(mail, password, companyName, webSite, phone, id);
//	}
//	
//	@PostMapping("/delete")
//	public Result delete(Employer employer) {
//		
//		return this.employersService.deleteEmployer(employer.getId());
//	}

}
