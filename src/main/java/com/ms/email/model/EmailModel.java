package com.ms.email.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ms.email.enums.StatusEmail;

//import lombok.Data;

//@Data
@Entity
@Table(name="TB_EMAIL")
public class EmailModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)/*geração automatica de id*/
	private long id;
	private String ownerRef; /*ref do usuario - NOME da pessoa*/
	private String emailFrom;/*quem esta mandando email*/
	private String emailTo;/*quem recebe email*/
	private String subject;/*titulo do email*/
	
	@Column(columnDefinition = "TEXT")
	private String text;
	
	private LocalDateTime sendDateEmail;/*injeção de dependencia do Objeto LocalDateTime*/
	private StatusEmail statusEmail;/*Status Email esta no meu pacote ENUM*/
	
	public EmailModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmailModel(long id, String ownerRef, String emailFrom, String emailTo, String subject, String text,
			LocalDateTime sendDateEmail, StatusEmail statusEmail) {
		super();
		this.id = id;
		this.ownerRef = ownerRef;
		this.emailFrom = emailFrom;
		this.emailTo = emailTo;
		this.subject = subject;
		this.text = text;
		this.sendDateEmail = sendDateEmail;
		this.statusEmail = statusEmail;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public LocalDateTime getSendDateEmail() {
		return sendDateEmail;
	}
	public void setSendDateEmail(LocalDateTime sendDateEmail) {
		this.sendDateEmail = sendDateEmail;
	}
	public StatusEmail getStatusEmail() {
		return statusEmail;
	}
	public void setStatusEmail(StatusEmail statusEmail) {
		this.statusEmail = statusEmail;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	
	
}
