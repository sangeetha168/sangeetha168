package validationModel;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor

@Entity
@Table(name= "validation")
public class ValidationModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message ="Name can't be empty")
	private String name;
	
	@NotNull(message = "Age is requied")
	@Min(value=3, message="age should be greater than 0")
	private int age;
	
	@NotBlank(message ="Email can't be empty")
	@Email(message ="Invalid email format!!")
	private String email;
	
	@NotBlank(message = "Password can't be empty")
	@Size(min = 5,message = "Password must be at least 5 characters")
	private String password;
	
	@NotBlank(message ="Addess can't be empty")
	private String address;
	
	private MultipartFile image;
	private String imageName;
	
}
