package kodlamaio.hrms.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import kodlamaio.hrms.entities.concretes.Employer;

@Repository
public interface EmployerDao extends JpaRepository<Employer, Integer>{
	
	@Modifying
    @Transactional
    @Query("update Employer e set e.email=:mail, e.password=:password, e.companyName=:companyName, e.webSite=:webSite, e.phone=:phone where e.id=:id")
    void updateEmployer(String mail, String password, String companyName, String webSite, String phone, int id);
	
	List<Employer> findAllByEmail(String email);
	boolean getById(int id);
}
