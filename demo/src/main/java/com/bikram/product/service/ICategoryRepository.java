package com.bikram.product.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikram.product.entity.Category;

interface ICategoryRepository extends JpaRepository<Category, Integer> {

}
