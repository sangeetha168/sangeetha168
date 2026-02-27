package validationservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import validationDto.validationDto;
import validationRepository.ValidationRepository;



@Service
public class ValidationService {

	
	@Autowired
	private ValidationRepository validRepo;
	
	public void saveStudent(validationDto dto){

	    StudentForm existing = repo.findByEmail(dto.getEmail());

	    if(existing != null){
	        throw new RuntimeException("Email already exists");
	    }

	    StudentForm student = new StudentForm();

	    student.setName(dto.getName());
	    student.setAge(dto.getAge());
	    student.setEmail(dto.getEmail());
	    student.setPassword(dto.getPassword());
	    student.setAddress(dto.getAddress());

	    repo.save(student);
	}
	
	
	public void updateStudent(Long id, StudentDTO dto){

	    StudentForm existing = repo.findByEmail(dto.getEmail());

	    if(existing != null && existing.getId() != id){
	        throw new RuntimeException("Email already exists");
	    }

	    StudentForm student = repo.findById(id).orElseThrow();

	    student.setName(dto.getName());
	    student.setAge(dto.getAge());
	    student.setEmail(dto.getEmail());
	    student.setPassword(dto.getPassword());
	    student.setAddress(dto.getAddress());

	    repo.save(student);
	}
	
	public StudentForm findByEmail(String email){
	    return repo.findByEmail(email);
	}

	public List<StudentForm> getAllStudents(){
	    return repo.findAll();
	}
	
}
