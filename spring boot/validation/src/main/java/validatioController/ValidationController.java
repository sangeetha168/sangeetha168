package validatioController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import validationservice.ValidationService;

@Controller
public class ValidationController {

	
	@Autowired
	private ValidationService validServ;
	
}
