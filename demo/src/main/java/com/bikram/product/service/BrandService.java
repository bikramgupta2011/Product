package com.bikram.product.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikram.product.entity.Brand;

@Service
public class BrandService {
	
	@Autowired
	private IBrandRepository iBrandRepo;
	
	public Brand createBrand(Brand brand) {
		return this.iBrandRepo.save(brand);
	}
	
	public List<Brand> getAllBrand(){
		return this.iBrandRepo.findAll();
	}
	
	public Brand getBrandById(UUID id){
		return this.iBrandRepo.findById(id).get();
	}

}
