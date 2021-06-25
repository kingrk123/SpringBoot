package in.nit.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class Employee {

	@Id
	private String id;
	
	@NonNull
	private Integer empId;
	@NonNull
	private String empName;
	@NonNull
	private Double empSal;
}
