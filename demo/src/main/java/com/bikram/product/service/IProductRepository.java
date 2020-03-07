package com.bikram.product.service;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikram.product.entity.Product;

interface IProductRepository extends JpaRepository<Product, UUID> {

}
