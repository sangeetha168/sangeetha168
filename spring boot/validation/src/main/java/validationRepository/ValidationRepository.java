package validationRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import validationModel.ValidationModel;

public interface ValidationRepository extends JpaRepository<ValidationModel, Long> {

	
	ValidationModel findByEmail(String email);
}
