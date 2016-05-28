package com.project.service.validation;

import org.springframework.stereotype.Component;

import com.project.exception.UserNotFoundException;
import com.project.repository.entity.UserEntity;

/**
 * @author Jay Paulynice (jay.paulynice@gmail.com)
 */
@Component
public class BeanValidation {
    public void checkEntityFound(final UserEntity entity, final Long id) {
        if (entity == null) {
            throw new UserNotFoundException("No user exists with id: " + id);
        }
    }
}