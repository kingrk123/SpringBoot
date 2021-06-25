package in.nit.model;

import java.util.List;

import lombok.Data;

@Data
public class Employee {

	private Integer empId;
	private String empName;
	private Double empSal;
	private String empGen;
	private String empAddr;
	private String empDept;
	private List<String> empSlot;
	private List<String> empClient;
	private String empJod;
	private String empPwd;
	
}
