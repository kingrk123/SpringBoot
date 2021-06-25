package in.nit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.nit.model.Address;
import in.nit.model.Vendor;

@RestController
public class VendorRestController {

	@PostMapping("/data")
	public String showData( 
			@RequestBody Vendor vendor) {
		return "Hello=>"+vendor.toString();
	}
}
