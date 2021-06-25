package in.nit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nit.model.Address;
import in.nit.model.Vendor;

@RestController
public class VendorRestController {

	@GetMapping("/one")
	public Vendor getOneVendor() {
		return new Vendor(10, "A", "PER", 
				List.of("M1","M2","M3"), 
				new String[] {"IN1","IN2"},
				
				Map.of("D1","V1","D2","V2"),
				
				new Address("5-55/A", "HYD"));
		
	}
}
