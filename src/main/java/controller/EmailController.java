package controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dto.EmailDto;
import model.EmailModel;
import service.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService; //injeção de dep. do service
	
	@PostMapping("/sending-email")/*uri sending-email é disparado quando alguem enviar email*/
	public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EmailDto emailDto){/*@valid faz a validação de todos os atributos do emailDTO*/
		EmailModel emailModel = new EmailModel();
		BeanUtils.copyProperties(emailDto, emailModel);/*este metodo faz a converção de DTO pra MODEL para poder salvar no BD*/
		emailService.sendEmail(emailModel);/*este metodo faz a converção de DTO pra MODEL*/
		return new ResponseEntity<>(emailModel, HttpStatus.CREATED);/*retorna para o cliente um MODEL e o STATUS*/
		/*apos realizar o metodo SENDEMAIL na classe Controller 
		 * é retornado ao controller o emailModel se foi enviado ou não atraves do metodo CREATED*/
	}
}
