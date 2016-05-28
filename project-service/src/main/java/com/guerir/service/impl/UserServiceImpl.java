package com.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.project.model.User;
import com.project.repository.UserRepository;
import com.project.repository.entity.UserEntity;
import com.project.service.UserService;
import com.project.service.mapper.UserMapper;
import com.project.service.validation.BeanValidation;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepository repo;
    private final UserMapper mapper;
    private final BeanValidation beanValidation;

    /**
     * Default constructor with dependencies injected
     *
     * @param repo the user repository
     * @param mapper the entity and dto mapper
     * @param beanValidation bean validation
     */
    @Autowired
    public UserServiceImpl(final UserRepository repo, final UserMapper mapper,
            final BeanValidation beanValidation) {
        this.repo = repo;
        this.mapper = mapper;
        this.beanValidation = beanValidation;
    }

    @Override
    @Transactional(
            propagation = Propagation.REQUIRED,
            readOnly = true)
    public User getUser(final Long id) {
        final UserEntity entity = repo.findOne(id);
        beanValidation.checkEntityFound(entity, id);

        return mapper.toDto(entity);
    }
}