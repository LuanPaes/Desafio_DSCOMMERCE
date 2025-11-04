package com.desafio.dscommerce.desafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desafio.dscommerce.desafio.dto.CategoryDTO;
import com.desafio.dscommerce.desafio.entities.Category;
import com.desafio.dscommerce.desafio.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll() {
		List<Category> result = repository.findAll();
		return result.stream().map(x -> new CategoryDTO(x)).toList();
	}
}
