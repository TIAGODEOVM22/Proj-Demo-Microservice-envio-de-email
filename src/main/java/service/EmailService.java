package service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import enums.StatusEmail;
import model.EmailModel;
import repository.EmailRepository;

@Service
public class EmailService {

	@Autowired /*injeção de dep. do repository*/
	private EmailRepository emailRepository;
	
	@Autowired
	private JavaMailSender emailSender;/*injeção de dep do JavaEmailSender, esta dependencia esta no arquivo POM*/
	
						/*nome do metodo SENDEMAIL*/
	public EmailModel sendEmail(EmailModel emailModel) {/*Metodo salva e envia email*/
		emailModel.setSendDateEmail(LocalDateTime.now());/*seta a data de envio do email atraves do atributo setSendDateEmail*/
		
		try {
			SimpleMailMessage message = new SimpleMailMessage();/*SimpleMailMessage classe do SpringEmail*/
			message.setFrom(emailModel.getEmailFrom());
			message.setTo(emailModel.getEmailTo());
			message.setSubject(emailModel.getSubject());
			message.setText(emailModel.getText());
			emailSender.send(message);
			/*depois de setar todos os atributos do email model em Objeto MESSAGE 
			passamos esse MESSAGE para o Obj emailSender que faz o envio*/
			/*se tudo der certo, salva o emailModel com o status email SENT*/
			emailModel.setStatusEmail(StatusEmail.SENT);
		}catch(MailException e){
			emailModel.setStatusEmail(StatusEmail.ERROR);
			/*se der errado, o emailModel sera setado como Status ERROR*/
			
		}finally {
			/*Aqui salva o email model como SENT ou ERROR*/
			return emailRepository.save(emailModel);
		}
		
	}
}
