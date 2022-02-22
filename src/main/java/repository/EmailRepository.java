package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long>{

}
