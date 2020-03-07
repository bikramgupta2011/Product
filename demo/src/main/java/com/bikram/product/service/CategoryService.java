package com.bikram.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikram.product.entity.Category;

@Service
public class CategoryService {
	
	@Autowired
	private ICategoryRepository iCategoryRepo;
	
	public Category createCatagory(Category category) {
		return this.iCategoryRepo.save(category);
	}
	
	public List<Category> getAllCategory(){
		return this.iCategoryRepo.findAll();
	}
	
	public Category getCategoryById(int id){
		return this.iCategoryRepo.findById(id).get();
	}

}
