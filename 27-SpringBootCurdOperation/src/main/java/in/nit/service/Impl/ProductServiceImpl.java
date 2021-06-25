package in.nit.service.Impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.model.Product;
import in.nit.repo.ProductRepository;
import in.nit.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	private ProductRepository repo; //HAS-A
	
	@Override
	public void saveProduct(Product p) {
		double cost=p.getProdCost();
		p.setProdDiscount(cost * 12/100.0);
		p.setProdGst(cost * 8/100.0);
		repo.save(p);
	}
	
	@Override
	public List<Product> getAllProducts() {
		List<Product> list=repo.findAll();
		Collections.sort(list,(p1,p2)->p1.getProdId()-p2.getProdId());
		return list;
	}
	
	@Override
	public void deleteProduct(Integer id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
		}
	}
	
	@Override
	public Product getOneProduct(Integer id) {
		Optional<Product> opt=repo.findById(id);
		if(opt.isPresent()) 
			return opt.get();
		return null;
	}
	
	
	@Override
	public void updateProduct(Product p) {
		double cost=p.getProdCost();
		p.setProdDiscount(cost * 12/100.0);
		p.setProdGst(cost * 8/100.0);
		repo.save(p);
	}
}
