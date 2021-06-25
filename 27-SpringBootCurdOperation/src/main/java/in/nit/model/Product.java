package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	@GenericGenerator(name = "gen1",
					strategy = "hilo",
					parameters = {
							@Parameter(name="table",value = "HB_Hilo"),
							@Parameter(name="column",value = "HB_Hi"),
							@Parameter(name="max_lo",value = "5")
							
					})
	@GeneratedValue(generator = "gen1")
	private Integer prodId;
	private String prodCode;
	private Double prodCost;
	
	private Double prodDiscount;
	private Double prodGst;
}
