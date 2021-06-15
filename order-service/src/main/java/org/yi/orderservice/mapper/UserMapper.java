package org.yi.orderservice.mapper;

import org.apache.ibatis.annotations.Param;
import org.yi.orderservice.module.entity.UserEntity;

/**
 * @author Yi
 */
public interface UserMapper {
    UserEntity selectOne(@Param("id")Long id);
}
