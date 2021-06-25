package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.Data;

@Data
@Entity
public class Product {

	/*
	 * @Id
	 * 
	 * @GenericGenerator(name = "p_id", strategy = "in.nit.generator.Mygenerator")
	 * 
	 * @GeneratedValue(generator = "p_id")
	 * 
	 * @Column(name="p_id")
	 */
//	@Id
//	@GenericGenerator(name = "gen1",
//						strategy = "hilo",
//						parameters = {
//								@Parameter(name="table",value = "HB_HILO"),
//								@Parameter(name="column",value = "HB_HI"),
//								@Parameter(name="maxlo",value = "5")
//						})		
//	@GeneratedValue(generator = "gen1")
	@Id
	@GeneratedValue
	private Integer prodId;
	private String prodCode;
	private Double prodCost;
	
	private Double prodDiscount;
	private Double prodGst;
}
