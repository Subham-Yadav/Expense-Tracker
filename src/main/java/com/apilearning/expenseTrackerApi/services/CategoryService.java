package com.apilearning.expenseTrackerApi.services;

import java.util.List;

import com.apilearning.expenseTrackerApi.domain.Category;
import com.apilearning.expenseTrackerApi.exceptions.EtBadRequestException;
import com.apilearning.expenseTrackerApi.exceptions.EtResourceNotFoundException;

public interface CategoryService {
	List<Category> fetchAllCategories(Integer userId);
	
	Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

	Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

	void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;
	
	void removeCategoryWithAllTransaction(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
}
