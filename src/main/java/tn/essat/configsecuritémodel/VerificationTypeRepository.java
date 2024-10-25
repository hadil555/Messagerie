package tn.essat.configsecuritémodel;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.essat.configsecurité.*;

public interface VerificationTypeRepository extends JpaRepository<VerifivationToken, Long>{
	 VerifivationToken findByToken(String token);

}
