package tn.essat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import tn.essat.dao.MessagereiceivedRepository;
import tn.essat.dao.MessagesendRepository;
import tn.essat.entites.Message;
import tn.essat.entites.Messagereiceived;
import tn.essat.entites.Messagesend;

@Service
@RequiredArgsConstructor
public class Messageimplements implements Messageservice{
	//private final messagereiceivedRepository messagereiceivedRepository;
	private final MessagereiceivedRepository messagereiceivedRepository;
	private final MessagesendRepository messagesendRepository;
	
	
	
	@Override
	public void delete(Long id) {
		
		messagereiceivedRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Messagereiceived save(Messagereiceived mesg) {
		Messagereiceived messagesaved=messagereiceivedRepository.save(mesg);
		// TODO Auto-generated method stub
		return messagesaved ;
	}

	@Override
	public Messagereiceived findByid(Long id) {
		Optional<Messagereiceived> optionmeseg=messagereiceivedRepository.findById(id);
		if(optionmeseg.isPresent()){
			return optionmeseg.get();
			
		}else {
			throw new RuntimeException("mesag not found");
		}
		
		// TODO Auto-generated method stub
	
	}

	@Override
	public List<Messagereiceived> AllMessage() {
		// TODO Auto-generated method stub
		return messagereiceivedRepository.findAll();
	}

	@Override
	public Messagereiceived update(Messagereiceived mesg) {
		Optional<Messagereiceived> optionmeseg=messagereiceivedRepository.findById(mesg.getId());
		if(optionmeseg.isPresent()) {
			optionmeseg.get().setId(mesg.getId());
			optionmeseg.get().setSujet(mesg.getSujet());
			optionmeseg.get().setUserrecieved(mesg.getUserrecieved());
			optionmeseg.get().setUsersend(mesg.getUsersend());
			optionmeseg.get().setEtat(mesg.getEtat());
			Messagereiceived  messagesaved=messagereiceivedRepository.save(optionmeseg.get());
			
			return  messagesaved ;
		}
		
		else {
			throw new RuntimeException("mesgnotfound");
		}	
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletesendermsg(Long id) {
		messagesendRepository.deleteById(id);

		// TODO Auto-generated method stub
		
	}

	@Override
	public Messagesend savesendermsg(Messagesend mesg) {
		Messagesend messagesaved=messagesendRepository.save(mesg);
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		return messagesaved;
	}

	@Override
	public Messagesend findByidsendermsg(Long id) {
		Optional<Messagesend> optionmeseg=messagesendRepository.findById(id);
		if(optionmeseg.isPresent()){
			return optionmeseg.get();
			
		}else {
			throw new RuntimeException("mesag not found");
		}
		// TODO Auto-generated method stub
	
	}

	@Override
	public List<Messagesend> AllMessagesender() {
		return messagesendRepository.findAll();
		// TODO Auto-generated method stub
	
	}

	@Override
	public Messagesend updatesender(Messagesend mesg) {
		Optional<Messagesend> optionmeseg=messagesendRepository.findById(mesg.getId());
		if(optionmeseg.isPresent()) {
			optionmeseg.get().setId(mesg.getId());
			optionmeseg.get().setSujet(mesg.getSujet());
			optionmeseg.get().setUserrecieved(mesg.getUserrecieved());
			optionmeseg.get().setUsersend(mesg.getUsersend());
			optionmeseg.get().setEtat(mesg.getEtat());
			Messagesend  messagesaved=messagesendRepository.save(optionmeseg.get());
			
			return  messagesaved ;
		}
		
		else {
			throw new RuntimeException("mesgnotfound");
		}	
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		
	}

}
