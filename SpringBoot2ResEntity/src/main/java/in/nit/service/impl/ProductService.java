package in.nit.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.model.Product;
import in.nit.repo.IProductRepo;
import in.nit.service.IProductService;

@Service
public class ProductService implements IProductService {

	@Autowired
	private IProductRepo repo;
	
	@Override
	public Integer saveProduct(Product p) {
		return repo.save(p).getProdId();
	}

	@Override
	public void updateProduct(Product p) {
		repo.save(p);
	}

	@Override
	public void deleteProduct(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Optional<Product> getOneProduct(Integer id) {
		return repo.findById(id);
	}

	@Override
	public List<Product> getAllProduct() {
		return repo.findAll();
	}

	@Override
	public boolean isProductExist(Integer id) {
		return repo.existsById(id);
	}

}
