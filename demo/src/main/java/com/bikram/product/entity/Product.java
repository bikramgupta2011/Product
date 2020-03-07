package com.bikram.product.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name ="product")
@Data
public class Product {
	
	@Id
	@GeneratedValue
	@Setter(value = AccessLevel.NONE)
	private UUID id;
	
	@Column(name = "name",length = 45,nullable = false)
	private String name;
	
	@JoinColumn(name = "brand_id",foreignKey = @ForeignKey(foreignKeyDefinition = "fk_brand_id"))
	@ManyToOne
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private Brand brand;
	
	@JoinColumn(name = "category_id",foreignKey = @ForeignKey(foreignKeyDefinition = "fk_category_id"))
	@ManyToOne
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private Category category;
	
	@Column(name = "price", nullable = false)
	private double price;
	
	@Column(name = "mf_date")
	private Date manufactureData;
	
	@Column(name = "exp_date")
	private Date expireDate;

}
