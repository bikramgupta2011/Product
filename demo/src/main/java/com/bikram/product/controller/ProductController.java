package com.bikram.product.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikram.product.entity.Brand;
import com.bikram.product.entity.Category;
import com.bikram.product.entity.Product;
import com.bikram.product.service.BrandService;
import com.bikram.product.service.CategoryService;
import com.bikram.product.service.ProductService;

@RestController
@RequestMapping(path = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private BrandService brandService;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping(path = "/{id}")
	public Product getProductById(@PathVariable("id") UUID id) {
		return this.productService.getProductById(id);
	}
	
	@GetMapping
	public List<Product> getAllProduct() {
		return this.productService.getAllProduct();
	}
	
	@PostMapping(path="/create")
	public Product createProduct(@RequestBody Product product) {
		return this.productService.createProduct(product);
	}
	
	@PutMapping(path="/update")
	public Product updateProduct(@RequestBody Product product) {
		return this.productService.updateProduct(product);
	}
	
	@DeleteMapping(path="/{id}" )
	public void deleteProduct(@PathVariable("id") UUID id) {
		this.productService.deleteProduct(id);
	}
	
	@GetMapping(path = "/brand/{id}")
	public Brand getBrandById(@PathVariable("id") UUID id) {
		return this.brandService.getBrandById(id);
	}
	
	@GetMapping(path="/brand")
	public List<Brand> getAllBrand() {
		return this.brandService.getAllBrand();
	}
	
	@PostMapping(path="/brand")
	public Brand createBrand(@RequestBody Brand brand) {
		return this.brandService.createBrand(brand);
	}
	
	@GetMapping(path = "/category/{id}")
	public Category getCategoryById(@PathVariable("id") int id) {
		return this.categoryService.getCategoryById(id);
	}
	
	@GetMapping(path="/category")
	public List<Category> getAllCategory() {
		return this.categoryService.getAllCategory();
	}
	
	@PostMapping(path="/category")
	public Category createCategory(@RequestBody Category category) {
		return this.categoryService.createCatagory(category);
	}

}
