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
@RequiredArgsConstructor
@Document
public class Student {

	@Id
	private String id;
	
	@NonNull
	private Integer stdId;
	@NonNull 
	private String stdName;
	@NonNull
	private Double stdFee;
}
