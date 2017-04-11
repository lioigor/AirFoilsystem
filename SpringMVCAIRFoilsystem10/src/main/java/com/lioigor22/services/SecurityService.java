package com.lioigor22.services;

/**
 * Service for Security.
 *
 * @author Igor Likarenko
 * @version 1.0
 */

public interface SecurityService {

	String findLoggedInUsername();

	void autoLogin(String username, String password);
}
