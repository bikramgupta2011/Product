package com.bikram.product.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bikram.product.entity.Product;

@Service
public class ProductService {
	
	@Autowired
	private IProductRepository iProductRepo;
	
	public List<Product> getAllProduct() {
		return this.iProductRepo.findAll();
	}
	
	public Product getProductById(UUID id) {
		Optional<Product> isPresent = this.iProductRepo.findById(id);
		if(isPresent.isPresent()) {
			return isPresent.get();
		}else {
			// throw new Exception();
		}
		return null;
	}
	
	public Product createProduct(Product product) {
		return this.iProductRepo.save(product);
	}
	
	public void deleteProduct(UUID id) {
		if(null != id) {
			this.iProductRepo.deleteById(id);
		}else {
			//throw exception product id is not available
		}
	}
	
	public Product updateProduct(Product product) {
		if(null != product.getId()) {
			return this.iProductRepo.save(product);
		}else {
			// throw exception product id is not available
			return null;
		}
	}

}
