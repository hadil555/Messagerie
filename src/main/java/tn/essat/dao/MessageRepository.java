package tn.essat.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.essat.entites.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
	

}
