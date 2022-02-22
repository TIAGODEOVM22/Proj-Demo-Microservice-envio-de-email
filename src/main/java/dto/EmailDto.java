package dto;

import javax.validation.constraints.Email;//faz a validaçao de um email real.
import javax.validation.constraints.NotBlank;
/*faz a validação no post, enviando uma betRequest para o usuario
 * falando que o campo mapeado é obrigatório*/

import lombok.Data;

@Data
public class EmailDto {

	@NotBlank
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
}
