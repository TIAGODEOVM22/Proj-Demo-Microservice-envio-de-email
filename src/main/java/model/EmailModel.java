package model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import enums.StatusEmail;
import lombok.Data;
@Data /*não precisa usar get set e construtores*/
@Entity
@Table(name="TB_EMAIL")
public class EmailModel implements Serializable{
	private static final long serialVersionUID = 1;
	
	private long id;
	private String ownerRef; /*ref do usuario*/
	private String emailFrom;/*quem esta mandando email*/
	private String emailTo;/*quem recebe email*/
	private String subject;/*titulo do email*/
	@Column(columnDefinition = "TEXT")
	private String text;
	private LocalDateTime senDateEmai;
	private StatusEmail statusEmail;

	

}
