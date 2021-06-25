package in.nit.model;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vendor {
	
	private Integer venId;
	private String venCode;
	private String venType;
	private List<String> models;
	private String[] info;
	private Map<String,String> details;
	
	private Address addr;

}
