package com.bikram.product.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
@Table(name = "Product_brand")
@Data
public class Brand {
	
	@Id
	@GeneratedValue
	@Setter(value = AccessLevel.NONE)
	private UUID brandId;
	
	@Column(name = "name",length = 100,nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "brand", fetch = FetchType.LAZY)
	private List<Product> product = new ArrayList<>();

}
