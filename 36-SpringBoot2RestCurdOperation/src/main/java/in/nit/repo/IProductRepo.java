package in.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.model.Product;

public interface IProductRepo extends JpaRepository<Product, Integer> {

}
