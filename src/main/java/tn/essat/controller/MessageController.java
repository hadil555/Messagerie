package tn.essat.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.essat.entites.User;

import lombok.AllArgsConstructor;
import tn.essat.entites.Message;
import tn.essat.service.Messageservice;
import tn.essat.service.Userservice;

@RestController
@RequestMapping("/mesg")
@AllArgsConstructor

public class MessageController {
	
	private final Messageservice messageservice;
	@DeleteMapping("/deleteByid/{id}")
	public void delete( @PathVariable("id") Long id) {
		messageservice.delete(id);


	}
	@PostMapping("/save")
	public Message save ( @RequestBody  Message mesg) {
		
		messageservice.save(mesg);
		return messageservice.save(mesg);
	}
	public Message findByid(@PathVariable("id")   Long id) {
		return messageservice.findByid(id);
	}
	@PostMapping("/update")
	public Message  update(@RequestBody  Message mesg) {
		return messageservice.save(mesg);
	}
	
	

	
	

}
