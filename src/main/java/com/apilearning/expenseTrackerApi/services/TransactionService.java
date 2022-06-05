package com.apilearning.expenseTrackerApi.services;

import java.util.List;

import com.apilearning.expenseTrackerApi.domain.Transaction;
import com.apilearning.expenseTrackerApi.exceptions.EtBadRequestException;
import com.apilearning.expenseTrackerApi.exceptions.EtResourceNotFoundException;

public interface TransactionService {

	List<Transaction> fetchAllTransactions(Integer userId, Integer categoryId);
	
	Transaction fetchTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;
	
	Transaction addTransaction(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestException;

	void updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws EtBadRequestException;
	
	void removeTransaction(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;

	
}
