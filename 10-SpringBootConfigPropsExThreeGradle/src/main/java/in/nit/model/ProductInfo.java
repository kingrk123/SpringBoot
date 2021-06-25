package in.nit.model;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ProductInfo {
	private Integer pid;
	private String pcode;
	private Double pversion;
	
	private List<String> modules;
	private Map<String,String> codes;
}

