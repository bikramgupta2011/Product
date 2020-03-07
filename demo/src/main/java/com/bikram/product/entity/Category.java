package com.bikram.product.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Table(name="product_category")
@Data
public class Category {
	
	@Id
	@GeneratedValue
	@Setter(value = AccessLevel.NONE)
	private int cId;
	
	@Column(name = "category_name")
	private String name;
	
	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
	private List<Product> product = new ArrayList<>();

}
