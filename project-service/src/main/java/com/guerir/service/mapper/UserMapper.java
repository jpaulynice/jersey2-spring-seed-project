package com.project.service.mapper;

import org.springframework.stereotype.Component;

import com.project.model.User;
import com.project.repository.entity.UserEntity;

/**
 * @author Jay Paulynice (jay.paulynice@gmail.com)
 */
@Component
public class UserMapper {
    /**
     * Map from user dto object to user entity object
     *
     * @param dto the dto object to map
     * @return the entity object
     */
    public UserEntity toEntity(final User dto) {
        if (dto == null) {
            return null;
        }

        final UserEntity entity = new UserEntity();
        entity.setId(dto.getId());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setUserName(dto.getUserName());

        return entity;
    }

    /**
     * Map from user entity object to user dto object
     *
     * @param entity the entity to map
     * @return the dto object
     */
    public User toDto(final UserEntity entity) {
        if (entity == null) {
            return null;
        }

        final User dto = new User();
        dto.setId(entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setUserName(entity.getUserName());

        return dto;
    }
}
