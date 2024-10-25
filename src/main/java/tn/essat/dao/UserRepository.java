package tn.essat.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;
import tn.essat.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{

	 boolean existsByUsername(String username);
	   Optional<User>  findByUsername(String email);
	   @Modifying
	   @Transactional
	   @Query("update User u set u.password = ?2 where u.username = ?1 ")
	   void updatePassword(String username, String password);
	 

}
