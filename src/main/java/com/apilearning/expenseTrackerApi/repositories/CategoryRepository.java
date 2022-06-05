package com.apilearning.expenseTrackerApi.repositories;

import java.util.List;

import com.apilearning.expenseTrackerApi.domain.Category;
import com.apilearning.expenseTrackerApi.exceptions.EtBadRequestException;
import com.apilearning.expenseTrackerApi.exceptions.EtResourceNotFoundException;

public interface CategoryRepository {
	List<Category> findAll(Integer userId) throws EtResourceNotFoundException;
	
	Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
	
	Integer create(Integer userId, String title, String description) throws EtResourceNotFoundException;
	
	void update(Integer userId, Integer categoryId, Category catrgory) throws EtBadRequestException;
	
	void removeById(Integer userId, Integer categoryId);
}
