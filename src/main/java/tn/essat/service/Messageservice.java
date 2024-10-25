package tn.essat.service;

import java.util.List;

import tn.essat.entites.Message;
import tn.essat.entites.Messagereiceived;
import tn.essat.entites.Messagesend;

public interface Messageservice {
	void delete(Long id);
	void deletesendermsg(Long id);
	
	
	Messagereiceived save(Messagereiceived mesg  );
	Messagesend savesendermsg(Messagesend mesg  );
	
	Messagereiceived findByid (Long id);
	Messagesend findByidsendermsg (Long id);
	
	List<Messagereiceived> AllMessage();
	List<Messagesend> AllMessagesender();
	Messagereiceived update(Messagereiceived mesg);
	Messagesend updatesender(Messagesend mesg);
	
	

}
