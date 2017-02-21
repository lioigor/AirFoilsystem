package com.lioigor22.service;

import com.lioigor22.objects.User;

/**
 * Service class for {@link net.proselyte.springsecurityapp.model.User}
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */

public interface UserService {

	void save(User user);

	User findByUsername(String username);
}
