package com.desafio.dscommerce.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.dscommerce.desafio.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
