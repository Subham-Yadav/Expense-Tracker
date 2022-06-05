package com.apilearning.expenseTrackerApi.services;

import com.apilearning.expenseTrackerApi.domain.User;
import com.apilearning.expenseTrackerApi.exceptions.EtAuthException;

public interface UserService {
	User validateUser(String email, String password) throws EtAuthException;
	
	User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
