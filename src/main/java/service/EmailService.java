package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.EmailModel;
import repository.EmailRepository;

@Service
public class EmailService {

	@Autowired //injeção de dep. do repository
	EmailRepository emailRepository;
	
	
	public void sendEmail(EmailModel emailModel) {/*Metodo salva e envia email*/
		
	}
}
