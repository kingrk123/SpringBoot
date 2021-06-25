package in.nit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nit.model.Product;
import in.nit.service.IProductService;

@RestController
@RequestMapping("/rest/product")
public class ProductRestController {
	@Autowired
	private IProductService service;

	@PostMapping("/save")	
	public ResponseEntity<String> saveProductData(
			@RequestBody Product product){
		ResponseEntity<String> resp =null;
		try {
			if (product.getProdId()!=null 
					&& service.isProductExist(product.getProdId())) {
				//Product Already Exist
				resp = new ResponseEntity<String>("Product Id'"+product.getProdId()+"' Already Exist."
						,HttpStatus.BAD_REQUEST);
			} else {
				Integer id = service.saveProduct(product);
				resp = new ResponseEntity<String>("Product Id'"+product.getProdId()+"' Created Successfully."
						,HttpStatus.OK); 
			}
		} catch (Exception e) {
			resp = new ResponseEntity<String>("Unable to save Data"
					,HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	
	@PutMapping("/modify")
	public ResponseEntity<String> updateProduct(
			@RequestBody Product product){
		ResponseEntity<String> resp = null;
		try {
			if (product.getProdId()!=null
					&& service.isProductExist(product.getProdId())) {
				service.updateProduct(product);
				resp = new ResponseEntity<String>("Product Id'"+product.getProdId()+"'Updated",HttpStatus.OK);
			} else {
				resp = new ResponseEntity<String>("Product Not Exist ",HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			resp = new ResponseEntity<String>("Unable to Update",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	
	@GetMapping("/one/{id}")
	public ResponseEntity<?> getOneProd(
			@PathVariable Integer id){
		ResponseEntity<?> resp =null;
		try {
			Optional<Product> opt = service.getOneProduct(id);
			if (opt.isPresent()) {
				Product product =opt.get();
				resp = new ResponseEntity<Product>(product , HttpStatus.OK);
			} else {
				resp = new ResponseEntity<String>("Product id "+id+" is Invalid", HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			resp = new ResponseEntity<String>("Unable To Fetch", HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> allProduct(){
		ResponseEntity<?> resp= null;
		try {
			List<Product> list = service.getAllProduct();
			resp = new ResponseEntity<List<Product>>(list,HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<String>("Unable to Fetch Products",HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}
		return resp;
	}
	
	@DeleteMapping("/rm/{id}")
	public ResponseEntity<String> deleteOneProduct(
			@PathVariable Integer id){
		ResponseEntity<String> resp = null;
		try {
			if (service.isProductExist(id)) {
				service.deleteProduct(id); 
				resp = new ResponseEntity<String>("Product Id "+id+" Deleted.", HttpStatus.OK);
			} else {
				resp = new ResponseEntity<String>("Product Id "+id+" is Invalid.", HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			resp = new ResponseEntity<String>("unable to delete Data",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;
	}
	}
