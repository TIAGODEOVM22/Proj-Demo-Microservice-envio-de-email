package com.ms.email.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class EmailDto {

	/*DTO é o objeto que a gente recebe no metodo POST*/

	@NotBlank /*TORNA O CAMPO OBRIGATORIO*/
	private String ownerRef; /*ref do usuario*/
	@NotBlank
	@Email
	private String emailFrom;/*quem esta mandando email*/
	@NotBlank
	@Email
	private String emailTo;/*quem recebe email*/
	@NotBlank
	private String subject;/*titulo do email*/
	@NotBlank
	private String text;
	
	/*TIVE QUE CRIAR OS CONSTRUTORES LOMBOK NÃO FUNCIONA*/
	public EmailDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmailDto(@NotBlank String ownerRef, @NotBlank @Email String emailFrom, @NotBlank @Email String emailTo,
			@NotBlank String subject, @NotBlank String text) {
		super();
		this.ownerRef = ownerRef;
		this.emailFrom = emailFrom;
		this.emailTo = emailTo;
		this.subject = subject;
		this.text = text;
	}


	public String getOwnerRef() {
		return ownerRef;
	}
	public void setOwnerRef(String ownerRef) {
		this.ownerRef = ownerRef;
	}
	public String getEmailFrom() {
		return emailFrom;
	}
	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}
	public String getEmailTo() {
		return emailTo;
	}
	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}
