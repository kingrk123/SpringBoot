package in.nit.service;

import java.util.List;

import in.nit.model.Product;

public interface IProductService {

	void saveProduct(Product p);
	List<Product> getAllProducts();
	void deleteProduct(Integer id);
	Product getOneProduct(Integer id);
	void updateProduct(Product p);
	
}
