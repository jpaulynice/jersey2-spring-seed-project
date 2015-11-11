package com.awesome.project.service;

import com.awesome.project.model.User;

/**
 * @author Jay Paulynice (jay.paulynice@gmail.com)
 */
public interface UserService {
    /**
     * Get user by id
     *
     * @param userId the config id
     * @return the user details
     */
    public User getUser(final Long userId);
}